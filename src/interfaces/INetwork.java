package interfaces;

import GUI.components.CellTableModel;

/**
 * @author Stedy
 *
 */
public interface INetwork {
	/**
	 * Start a new transfer.
	 * @param serviceId
	 * @param buyerId
	 * @param sellerId
	 */
	public void startTransfer(final int serviceId, final int buyerId, final int sellerId);
	
	/**
	 * New user gets online.
	 * 
	 * @param serviceId
	 * @param userId
	 */
	public void newUser(int serviceId, int userId);
	
	/**
	 * Launch an offer request.
	 * 
	 * @param serviceId
	 * @param userId
	 * @return
	 */
	public CellTableModel launchOfferRequest(int serviceId, int userId);
	
	/**
	 * Drop offer request.
	 * 
	 * @param serviceId
	 * @param userId
	 * @return
	 */
	public boolean dropOfferRequest(int serviceId, int userId);
	
	/**
	 * Accept offer. 
	 * @param serviceId
	 * @param buyerId
	 * @param sellerId
	 * @return
	 */
	public boolean acceptOffer(int serviceId, int buyerId, int sellerId);
	
	/**
	 * Refuse offer. 
	 * @param serviceId
	 * @param buyerId
	 * @param sellerId
	 * @return
	 */
	public boolean refuseOffer(int serviceId, int buyerId, int sellerId);
	
	/**
	 * Make offer.
	 * 
	 * @param serviceId
	 * @param buyerId
	 * @param sellerId
	 * @param price
	 * @return
	 */
	public boolean makeOffer(int serviceId, int buyerId, int sellerId, int price);
	
	/**
	 * Remove offer. 
	 * @param serviceId
	 * @param buyerId
	 * @param sellerId
	 * @return
	 */
	public boolean removeOffer(int serviceId, int buyerId, int sellerId);
	
	/**
	 * Announce a seller that his offer was refused.
	 * @param serviceId
	 * @param buyerId
	 */
	public void offerRefused(int serviceId, int buyerId);
	
	/**
	 * Announce a seller that his offer was accepted.
	 * @param serviceId
	 * @param buyerId
	 */
	public void offerAccepted(int serviceId, int buyerId);
	
	/**
	 * Announce a seller that his offer was exceeded.
	 * 
	 * @param serviceId
	 * @param buyerId
	 * @param price
	 */
	public void offerExceeded(int serviceId, int buyerId, int price);
	
	/**
	 * Announce a seller that his offer is no longer exceeded.
	 * 
	 * @param serviceId
	 * @param buyerId
	 * @param price
	 */
	public void removeExceeded(int serviceId, int buyerId);
	
	/**
	 * Announce a buyer that there was made an offer for a service.
	 * 
	 * @param serviceId
	 * @param sellerId
	 * @param price
	 */
	public void offerMade(int serviceId, int sellerId, int price);
	
	/**
	 * Announce a buyer that a seller removed his offer.
	 * 
	 * @param serviceId
	 * @param buyerId
	 */
	public void offerRemoved(int serviceId, int sellerId);
}
