INSERT IGNORE INTO courses (title, description, category, image_url) VALUES
('Java Programming', 'Learn Java from scratch', 'Programming', 'https://via.placeholder.com/150'),
('Web Development', 'HTML CSS and JavaScript basics', 'Web', 'https://via.placeholder.com/150'),
('Spring Boot', 'Build REST APIs with Spring Boot', 'Programming', 'https://via.placeholder.com/150'),
('Database Design', 'MySQL and JPA fundamentals', 'Database', 'https://via.placeholder.com/150'),
('Python Basics', 'Introduction to Python programming', 'Programming', 'https://via.placeholder.com/150');

INSERT IGNORE INTO enrollments (student_id, course_id, enrolled_at, progress, completed) VALUES
(1, 1, '2026-01-15', '50%', false),
(1, 2, '2026-01-20', '100%', true),
(2, 1, '2026-02-01', '25%', false),
(2, 3, '2026-02-10', '75%', false),
(3, 2, '2026-03-01', '100%', true);