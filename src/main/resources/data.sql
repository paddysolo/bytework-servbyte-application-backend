
/**
 * Author:  Onaiwu Solomon
 * Created: Jul 31, 2021
 */

INSERT INTO service_category (name) VALUES 
             ('food'),('laundry'), ('pharmacy'), ('grocery');

INSERT INTO city (city_name) VALUES 
             ('Abuja'),('Lagos'), ('Ibadan'), ('Uyo'), ('Port Harcourt'), ('Enugu'), ('Asaba'), ('Kano'), ('Umuahia'), ('Onitsha'), ('Aba'), ('Owerri');

INSERT INTO service_provider(restaurant_name,email,phone_number) VALUES 
             ('BhEERHUGZ Cafe','solomononaiwu@gmail.com','09021172043'),
             ('Bungalow Restaurant','solomononaiwu@gmail.com','09021172043'), 
             ('Marcopolo Oriental Cuisine (Waterfront Restaurant)','solomononaiwu@gmail.com','09021172043'), 
             ('Metisse Restaurant','solomononaiwu@gmail.com','09021172043'),
             ('B.L. Restaurant, Bar and Cafe','solomononaiwu@gmail.com','09021172043'), 
             ('Johnny Rockets','solomononaiwu@gmail.com','09021172043'),
             ('Parallax Restaurant.','solomononaiwu@gmail.com','09021172043'),
             ('Cheesy Does It','solomononaiwu@gmail.com','09021172043'),
             ('Bizzy B Cakes','solomononaiwu@gmail.com','09021172043'),
             (' The Dairy Godmother ','solomononaiwu@gmail.com','09021172043'),
             ('Kale Me Crazy','solomononaiwu@gmail.com','09021172043'),
             ('Nacho Problem','solomononaiwu@gmail.com','09021172043'),
             ('Lettuce Eat','solomononaiwu@gmail.com','09021172043'),
             ('Juan More Taco','solomononaiwu@gmail.com','09021172043'),
             ('Mama Put Restaurant','solomononaiwu@gmail.com','09021172043');

INSERT INTO SERVICE_PROVIDER_CITY  (CITY_ID,SERVICE_PROVIDER_ID ) VALUES 
             (1,1),(1,2), (1,3), (2,4), (2,5), (2,6), (3,7), (3,8), (3,9), (4,10), (4,11), (4,12);

INSERT INTO meal (meal_name,picture_url,price,preparation_time,description) VALUES 
             ('Fried Rice and Chicken','https://eatforum.org/content/uploads/2018/05/table_with_food_top_view_900x700.jpg',3000,30,'Nigerian Fried Rice is a very simple yet delicious recipe. This version relies on a ton of fresh vegetables, Beef Liver, and a little bit of oil for crisping it up.'),
            ('Chicken Salad','https://images.indianexpress.com/2020/04/eat-right_759.jpg',4000,60,'Chicken Salad is a very simple yet delicious recipe. This version relies on a ton of fresh vegetables, Beef Liver,and a little bit of oil for crisping it up.'),
             ('Barbeque','https://sattvikfoods.com/wp-content/uploads/2020/01/satvik-dish-recipe-main-photo.jpg',1000,40,'Barbeque is a very simple yet delicious recipe. This version relies on a ton of fresh vegetables, Beef Liver, and a little bit of oil for crisping it up.'),
            ('Moi Moi','https://media-cdn.tripadvisor.com/media/photo-s/13/83/68/dc/andhra-thali.jpg',5000,50,'Moi Moi is a very simple yet delicious recipe. This version relies on a ton of fresh vegetables, Beef Liver,and a little bit of oil for crisping it up.'),
            ('Santa Cruaser','https://i.pinimg.com/originals/05/6a/46/056a46f8acf06cf2e451da1cc91adb21.jpg',10000,30,'Santa Cruaser is a very simple yet delicious recipe. This version relies on a ton of fresh vegetables, Beef Liver,and a little bit of oil for crisping it up.'),
            ('Yam and Beans','https://deih43ym53wif.cloudfront.net/idly-food-india-shutterstock_101041240_7bd8a6703f.jpeg',3000,70,'Yam and Beans is a very simple yet delicious recipe. This version relies on a ton of fresh vegetables, Beef Liver, and a little bit of oil for crisping it up.');


INSERT INTO MEAL_SERVICE_PROVIDER   (SERVICE_PROVIDER_ID ,MEAL_ID  
 ) VALUES 
             (1,1),(1,2), (1,3),(2,4), (2,5), (2,6);

-- (2,1), (2,2), (2,4), (3,5), (3,3), (3,1), (4,6), (4,1), (4,2);


