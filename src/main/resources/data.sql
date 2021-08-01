
/**
 * Author:  Onaiwu Solomon
 * Created: Jul 31, 2021
 */

INSERT INTO service_category (name) VALUES 
             ('food'),('laundry'), ('pharmacy'), ('grocery');

INSERT INTO city (city_name) VALUES 
             ('Abuja'),('Lagos'), ('Ibadan'), ('Uyo'), ('Port Harcourt'), ('Enugu'), ('Asaba'), ('Kano'), ('Umuahia'), ('Onitsha'), ('Aba'), ('Owerri');

INSERT INTO service_provider(restaurant_name,email,phone_number,logo_url) VALUES 
             ('BhEERHUGZ Cafe','solomononaiwu@gmail.com','09021172043','https://i.pinimg.com/736x/95/e8/4b/95e84bea1a35588752585f5340ec0a58.jpg'),
             ('Bungalow Restaurant','solomononaiwu@gmail.com','09021172043','https://i.pinimg.com/736x/95/e8/4b/95e84bea1a35588752585f5340ec0a58.jpg'), 
             ('Marcopolo Oriental Cuisine (Waterfront Restaurant)','solomononaiwu@gmail.com','09021172043','https://i.pinimg.com/736x/95/e8/4b/95e84bea1a35588752585f5340ec0a58.jpg'), 
             ('Metisse Restaurant','solomononaiwu@gmail.com','09021172043','https://i.pinimg.com/736x/95/e8/4b/95e84bea1a35588752585f5340ec0a58.jpg'),
             ('B.L. Restaurant, Bar and Cafe','solomononaiwu@gmail.com','09021172043','https://i.pinimg.com/736x/95/e8/4b/95e84bea1a35588752585f5340ec0a58.jpg'), 
             ('Johnny Rockets','solomononaiwu@gmail.com','09021172043','https://i.pinimg.com/736x/95/e8/4b/95e84bea1a35588752585f5340ec0a58.jpg'),
             ('Parallax Restaurant.','solomononaiwu@gmail.com','09021172043','https://i.pinimg.com/736x/95/e8/4b/95e84bea1a35588752585f5340ec0a58.jpg'),
             ('Cheesy Does It','solomononaiwu@gmail.com','09021172043','https://i.pinimg.com/736x/95/e8/4b/95e84bea1a35588752585f5340ec0a58.jpg'),
             ('Bizzy B Cakes','solomononaiwu@gmail.com','09021172043','https://i.pinimg.com/736x/95/e8/4b/95e84bea1a35588752585f5340ec0a58.jpg'),
             (' The Dairy Godmother ','solomononaiwu@gmail.com','09021172043','https://i.pinimg.com/736x/95/e8/4b/95e84bea1a35588752585f5340ec0a58.jpg'),
             ('Kale Me Crazy','solomononaiwu@gmail.com','09021172043','https://i.pinimg.com/736x/95/e8/4b/95e84bea1a35588752585f5340ec0a58.jpg'),
             ('Nacho Problem','solomononaiwu@gmail.com','09021172043','https://i.pinimg.com/736x/95/e8/4b/95e84bea1a35588752585f5340ec0a58.jpg'),
             ('Lettuce Eat','solomononaiwu@gmail.com','09021172043','https://i.pinimg.com/736x/95/e8/4b/95e84bea1a35588752585f5340ec0a58.jpg'),
             ('Juan More Taco','solomononaiwu@gmail.com','09021172043','https://i.pinimg.com/736x/95/e8/4b/95e84bea1a35588752585f5340ec0a58.jpg'),
             ('Mama Put Restaurant','solomononaiwu@gmail.com','09021172043','https://i.pinimg.com/736x/95/e8/4b/95e84bea1a35588752585f5340ec0a58.jpg'),
             ('Papa Put Restaurant','solomononaiwu@gmail.com','09021172043','https://i.pinimg.com/736x/95/e8/4b/95e84bea1a35588752585f5340ec0a58.jpg'),
             ('Put Restaurant','solomononaiwu@gmail.com','09021172043','https://i.pinimg.com/736x/95/e8/4b/95e84bea1a35588752585f5340ec0a58.jpg'),
             ('Gold  Restaurant','solomononaiwu@gmail.com','09021172043','https://i.pinimg.com/736x/95/e8/4b/95e84bea1a35588752585f5340ec0a58.jpg'),
             ('Silver Put Restaurant','solomononaiwu@gmail.com','09021172043','https://i.pinimg.com/736x/95/e8/4b/95e84bea1a35588752585f5340ec0a58.jpg'),
             ('Love Put Restaurant','solomononaiwu@gmail.com','09021172043','https://i.pinimg.com/736x/95/e8/4b/95e84bea1a35588752585f5340ec0a58.jpg'),
             ('Byte Restaurant','solomononaiwu@gmail.com','09021172043','https://i.pinimg.com/736x/95/e8/4b/95e84bea1a35588752585f5340ec0a58.jpg'),
             ('Cook Restaurant','solomononaiwu@gmail.com','09021172043','https://i.pinimg.com/736x/95/e8/4b/95e84bea1a35588752585f5340ec0a58.jpg'),
             ('Sam Restaurant','solomononaiwu@gmail.com','09021172043','https://i.pinimg.com/736x/95/e8/4b/95e84bea1a35588752585f5340ec0a58.jpg'),
             ('Solomon Restaurant','solomononaiwu@gmail.com','09021172043','https://i.pinimg.com/736x/95/e8/4b/95e84bea1a35588752585f5340ec0a58.jpg');


INSERT INTO SERVICE_PROVIDER_CITY  (CITY_ID,SERVICE_PROVIDER_ID ) VALUES 
             (1,1),(1,2), (1,3), (2,4), (2,5), (2,6), (3,7), (3,8), (3,9), (4,10), (4,11), (4,12),
             (5,13),(6,14), (7,15), (8,16), (9,17), (10,18), (11,19), (12,20), (12,21), (12,22), (12,23),(12,24);

INSERT INTO meal (meal_name,picture_url,price,preparation_time,description) VALUES 
             ('Fried Rice and Chicken','https://eatforum.org/content/uploads/2018/05/table_with_food_top_view_900x700.jpg',3000,30,'Nigerian Fried Rice is a very simple yet delicious recipe. This version relies on a ton of fresh vegetables, Beef Liver, and a little bit of oil for crisping it up.'),
            ('Chicken Salad','https://images.indianexpress.com/2020/04/eat-right_759.jpg',4000,60,'Chicken Salad is a very simple yet delicious recipe. This version relies on a ton of fresh vegetables, Beef Liver,and a little bit of oil for crisping it up.'),
             ('Barbeque','https://sattvikfoods.com/wp-content/uploads/2020/01/satvik-dish-recipe-main-photo.jpg',1000,40,'Barbeque is a very simple yet delicious recipe. This version relies on a ton of fresh vegetables, Beef Liver, and a little bit of oil for crisping it up.'),
            ('Moi Moi','https://media-cdn.tripadvisor.com/media/photo-s/13/83/68/dc/andhra-thali.jpg',5000,50,'Moi Moi is a very simple yet delicious recipe. This version relies on a ton of fresh vegetables, Beef Liver,and a little bit of oil for crisping it up.'),
            ('Santa Cruaser','https://i.pinimg.com/originals/05/6a/46/056a46f8acf06cf2e451da1cc91adb21.jpg',10000,30,'Santa Cruaser is a very simple yet delicious recipe. This version relies on a ton of fresh vegetables, Beef Liver,and a little bit of oil for crisping it up.'),
             ('Fried Rice and Chicken','https://eatforum.org/content/uploads/2018/05/table_with_food_top_view_900x700.jpg',3000,30,'Nigerian Fried Rice is a very simple yet delicious recipe. This version relies on a ton of fresh vegetables, Beef Liver, and a little bit of oil for crisping it up.'),
            ('Chicken Salad','https://images.indianexpress.com/2020/04/eat-right_759.jpg',4000,60,'Chicken Salad is a very simple yet delicious recipe. This version relies on a ton of fresh vegetables, Beef Liver,and a little bit of oil for crisping it up.'),
             ('Barbeque','https://sattvikfoods.com/wp-content/uploads/2020/01/satvik-dish-recipe-main-photo.jpg',1000,40,'Barbeque is a very simple yet delicious recipe. This version relies on a ton of fresh vegetables, Beef Liver, and a little bit of oil for crisping it up.'),
            ('Moi Moi','https://media-cdn.tripadvisor.com/media/photo-s/13/83/68/dc/andhra-thali.jpg',5000,50,'Moi Moi is a very simple yet delicious recipe. This version relies on a ton of fresh vegetables, Beef Liver,and a little bit of oil for crisping it up.'),
            ('Santa Cruaser','https://i.pinimg.com/originals/05/6a/46/056a46f8acf06cf2e451da1cc91adb21.jpg',10000,30,'Santa Cruaser is a very simple yet delicious recipe. This version relies on a ton of fresh vegetables, Beef Liver,and a little bit of oil for crisping it up.'),
             ('Fried Rice and Chicken','https://eatforum.org/content/uploads/2018/05/table_with_food_top_view_900x700.jpg',3000,30,'Nigerian Fried Rice is a very simple yet delicious recipe. This version relies on a ton of fresh vegetables, Beef Liver, and a little bit of oil for crisping it up.'),
            ('Chicken Salad','https://images.indianexpress.com/2020/04/eat-right_759.jpg',4000,60,'Chicken Salad is a very simple yet delicious recipe. This version relies on a ton of fresh vegetables, Beef Liver,and a little bit of oil for crisping it up.'),
             ('Barbeque','https://sattvikfoods.com/wp-content/uploads/2020/01/satvik-dish-recipe-main-photo.jpg',1000,40,'Barbeque is a very simple yet delicious recipe. This version relies on a ton of fresh vegetables, Beef Liver, and a little bit of oil for crisping it up.'),
            ('Moi Moi','https://media-cdn.tripadvisor.com/media/photo-s/13/83/68/dc/andhra-thali.jpg',5000,50,'Moi Moi is a very simple yet delicious recipe. This version relies on a ton of fresh vegetables, Beef Liver,and a little bit of oil for crisping it up.'),
            ('Santa Cruaser','https://i.pinimg.com/originals/05/6a/46/056a46f8acf06cf2e451da1cc91adb21.jpg',10000,30,'Santa Cruaser is a very simple yet delicious recipe. This version relies on a ton of fresh vegetables, Beef Liver,and a little bit of oil for crisping it up.'),
             ('Fried Rice and Chicken','https://eatforum.org/content/uploads/2018/05/table_with_food_top_view_900x700.jpg',3000,30,'Nigerian Fried Rice is a very simple yet delicious recipe. This version relies on a ton of fresh vegetables, Beef Liver, and a little bit of oil for crisping it up.'),
            ('Chicken Salad','https://images.indianexpress.com/2020/04/eat-right_759.jpg',4000,60,'Chicken Salad is a very simple yet delicious recipe. This version relies on a ton of fresh vegetables, Beef Liver,and a little bit of oil for crisping it up.'),
             ('Barbeque','https://sattvikfoods.com/wp-content/uploads/2020/01/satvik-dish-recipe-main-photo.jpg',1000,40,'Barbeque is a very simple yet delicious recipe. This version relies on a ton of fresh vegetables, Beef Liver, and a little bit of oil for crisping it up.'),
            ('Moi Moi','https://media-cdn.tripadvisor.com/media/photo-s/13/83/68/dc/andhra-thali.jpg',5000,50,'Moi Moi is a very simple yet delicious recipe. This version relies on a ton of fresh vegetables, Beef Liver,and a little bit of oil for crisping it up.'),
            ('Santa Cruaser','https://i.pinimg.com/originals/05/6a/46/056a46f8acf06cf2e451da1cc91adb21.jpg',10000,30,'Santa Cruaser is a very simple yet delicious recipe. This version relies on a ton of fresh vegetables, Beef Liver,and a little bit of oil for crisping it up.'),
             ('Fried Rice and Chicken','https://eatforum.org/content/uploads/2018/05/table_with_food_top_view_900x700.jpg',3000,30,'Nigerian Fried Rice is a very simple yet delicious recipe. This version relies on a ton of fresh vegetables, Beef Liver, and a little bit of oil for crisping it up.'),
            ('Chicken Salad','https://images.indianexpress.com/2020/04/eat-right_759.jpg',4000,60,'Chicken Salad is a very simple yet delicious recipe. This version relies on a ton of fresh vegetables, Beef Liver,and a little bit of oil for crisping it up.'),
             ('Barbeque','https://sattvikfoods.com/wp-content/uploads/2020/01/satvik-dish-recipe-main-photo.jpg',1000,40,'Barbeque is a very simple yet delicious recipe. This version relies on a ton of fresh vegetables, Beef Liver, and a little bit of oil for crisping it up.'),
            ('Moi Moi','https://media-cdn.tripadvisor.com/media/photo-s/13/83/68/dc/andhra-thali.jpg',5000,50,'Moi Moi is a very simple yet delicious recipe. This version relies on a ton of fresh vegetables, Beef Liver,and a little bit of oil for crisping it up.'),
            ('Santa Cruaser','https://i.pinimg.com/originals/05/6a/46/056a46f8acf06cf2e451da1cc91adb21.jpg',10000,30,'Santa Cruaser is a very simple yet delicious recipe. This version relies on a ton of fresh vegetables, Beef Liver,and a little bit of oil for crisping it up.'),
             ('Fried Rice and Chicken','https://eatforum.org/content/uploads/2018/05/table_with_food_top_view_900x700.jpg',3000,30,'Nigerian Fried Rice is a very simple yet delicious recipe. This version relies on a ton of fresh vegetables, Beef Liver, and a little bit of oil for crisping it up.'),
            ('Chicken Salad','https://images.indianexpress.com/2020/04/eat-right_759.jpg',4000,60,'Chicken Salad is a very simple yet delicious recipe. This version relies on a ton of fresh vegetables, Beef Liver,and a little bit of oil for crisping it up.'),
             ('Barbeque','https://sattvikfoods.com/wp-content/uploads/2020/01/satvik-dish-recipe-main-photo.jpg',1000,40,'Barbeque is a very simple yet delicious recipe. This version relies on a ton of fresh vegetables, Beef Liver, and a little bit of oil for crisping it up.'),
            ('Moi Moi','https://media-cdn.tripadvisor.com/media/photo-s/13/83/68/dc/andhra-thali.jpg',5000,50,'Moi Moi is a very simple yet delicious recipe. This version relies on a ton of fresh vegetables, Beef Liver,and a little bit of oil for crisping it up.'),
            ('Santa Cruaser','https://i.pinimg.com/originals/05/6a/46/056a46f8acf06cf2e451da1cc91adb21.jpg',10000,30,'Santa Cruaser is a very simple yet delicious recipe. This version relies on a ton of fresh vegetables, Beef Liver,and a little bit of oil for crisping it up.'),
            ('Yam and Beans','https://deih43ym53wif.cloudfront.net/idly-food-india-shutterstock_101041240_7bd8a6703f.jpeg',3000,70,'Yam and Beans is a very simple yet delicious recipe. This version relies on a ton of fresh vegetables, Beef Liver, and a little bit of oil for crisping it up.');


INSERT INTO MEAL_SERVICE_PROVIDER   (SERVICE_PROVIDER_ID ,MEAL_ID  
 ) VALUES 
             (1,1),(1,2), (1,3),(2,4), (2,5), (2,6), (3,7),(3,8), (4,9),(4,10), (5,11), (6,12),
             (7,13),(7,14), (8,15),(9,16), (10,17), (11,18), (12,19),
             (13,20),(14,21), (15,22),(16,23), (17,24), (18,25), (19,26),(20,27), (21,28),(22,29), (23,30), (24,31);




