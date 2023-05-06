package favorite;

public class favorite {

	    private Integer favoriteID;
	    private Integer animalID;
	    private Integer userID;
	    private boolean favoriteMark;
	    
	    
	    
		public favorite(Integer favoriteID, Integer animalID, Integer userID, boolean favoriteMark) {
			super();
			this.favoriteID = favoriteID;
			this.animalID = animalID;
			this.userID = userID;
			this.favoriteMark = favoriteMark;
		}
		public Integer getFavoriteID() {
			return favoriteID;
		}
		public void setFavoriteID(Integer favoriteID) {
			this.favoriteID = favoriteID;
		}
		public Integer getAnimalID() {
			return animalID;
		}
		public void setAnimalID(Integer animalID) {
			this.animalID = animalID;
		}
		public Integer getUserID() {
			return userID;
		}
		public void setUserID(Integer userID) {
			this.userID = userID;
		}
		public boolean isFavoriteMark() {
			return favoriteMark;
		}
		public void setFavoriteMark(boolean favoriteMark) {
			this.favoriteMark = favoriteMark;
		}

	    
	}

