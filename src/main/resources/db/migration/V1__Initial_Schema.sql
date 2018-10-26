CREATE TABLE employee (
  employee_id         SERIAL      PRIMARY KEY,
  employee_firstname  VARCHAR(50) NOT NULL,
  employee_lastname   VARCHAR(50) NOT NULL
);

CREATE TABLE widget (
  widget_id             SERIAL      PRIMARY KEY,
  widget_inspector_id   INTEGER     NOT NULL,
  widget_inspection_ts  TIMESTAMP   DEFAULT now() NOT NULL
);

/* Employee Records */
INSERT INTO employee (employee_id, employee_firstname, employee_lastname) VALUES (1, 'John', 'Smith');
INSERT INTO employee (employee_id, employee_firstname, employee_lastname) VALUES (2, 'Jane', 'Doe');
INSERT INTO employee (employee_id, employee_firstname, employee_lastname) VALUES (3, 'Greg', 'Whitaker');
INSERT INTO employee (employee_id, employee_firstname, employee_lastname) VALUES (4, 'Matt', 'Simpson');
INSERT INTO employee (employee_id, employee_firstname, employee_lastname) VALUES (5, 'Richard', 'Packer');
INSERT INTO employee (employee_id, employee_firstname, employee_lastname) VALUES (6, 'Alex', 'Fargus');
INSERT INTO employee (employee_id, employee_firstname, employee_lastname) VALUES (7, 'Elizabeth', 'Mccall');
INSERT INTO employee (employee_id, employee_firstname, employee_lastname) VALUES (8, 'Janet', 'Anderson');

/* Widget Inspection Records */
INSERT INTO widget(widget_inspector_id) VALUES (2);
INSERT INTO widget(widget_inspector_id) VALUES (1);
INSERT INTO widget(widget_inspector_id) VALUES (4);
INSERT INTO widget(widget_inspector_id) VALUES (2);
INSERT INTO widget(widget_inspector_id) VALUES (6);
INSERT INTO widget(widget_inspector_id) VALUES (6);
INSERT INTO widget(widget_inspector_id) VALUES (3);
INSERT INTO widget(widget_inspector_id) VALUES (6);
INSERT INTO widget(widget_inspector_id) VALUES (2);
INSERT INTO widget(widget_inspector_id) VALUES (6);
INSERT INTO widget(widget_inspector_id) VALUES (5);
INSERT INTO widget(widget_inspector_id) VALUES (4);
INSERT INTO widget(widget_inspector_id) VALUES (8);
INSERT INTO widget(widget_inspector_id) VALUES (7);
INSERT INTO widget(widget_inspector_id) VALUES (8);
INSERT INTO widget(widget_inspector_id) VALUES (8);
INSERT INTO widget(widget_inspector_id) VALUES (4);
INSERT INTO widget(widget_inspector_id) VALUES (7);
INSERT INTO widget(widget_inspector_id) VALUES (4);
INSERT INTO widget(widget_inspector_id) VALUES (7);
INSERT INTO widget(widget_inspector_id) VALUES (3);
INSERT INTO widget(widget_inspector_id) VALUES (1);
INSERT INTO widget(widget_inspector_id) VALUES (5);
INSERT INTO widget(widget_inspector_id) VALUES (6);
INSERT INTO widget(widget_inspector_id) VALUES (3);
INSERT INTO widget(widget_inspector_id) VALUES (8);
INSERT INTO widget(widget_inspector_id) VALUES (2);
INSERT INTO widget(widget_inspector_id) VALUES (7);
INSERT INTO widget(widget_inspector_id) VALUES (8);
INSERT INTO widget(widget_inspector_id) VALUES (6);
INSERT INTO widget(widget_inspector_id) VALUES (2);
INSERT INTO widget(widget_inspector_id) VALUES (5);
INSERT INTO widget(widget_inspector_id) VALUES (5);
INSERT INTO widget(widget_inspector_id) VALUES (6);
INSERT INTO widget(widget_inspector_id) VALUES (6);
INSERT INTO widget(widget_inspector_id) VALUES (1);
INSERT INTO widget(widget_inspector_id) VALUES (1);
INSERT INTO widget(widget_inspector_id) VALUES (1);
INSERT INTO widget(widget_inspector_id) VALUES (1);
INSERT INTO widget(widget_inspector_id) VALUES (5);
INSERT INTO widget(widget_inspector_id) VALUES (7);
INSERT INTO widget(widget_inspector_id) VALUES (1);
INSERT INTO widget(widget_inspector_id) VALUES (5);
INSERT INTO widget(widget_inspector_id) VALUES (5);
INSERT INTO widget(widget_inspector_id) VALUES (4);
INSERT INTO widget(widget_inspector_id) VALUES (1);
INSERT INTO widget(widget_inspector_id) VALUES (7);
INSERT INTO widget(widget_inspector_id) VALUES (8);
INSERT INTO widget(widget_inspector_id) VALUES (1);
INSERT INTO widget(widget_inspector_id) VALUES (3);
INSERT INTO widget(widget_inspector_id) VALUES (4);
INSERT INTO widget(widget_inspector_id) VALUES (2);
INSERT INTO widget(widget_inspector_id) VALUES (6);
INSERT INTO widget(widget_inspector_id) VALUES (3);
INSERT INTO widget(widget_inspector_id) VALUES (3);
INSERT INTO widget(widget_inspector_id) VALUES (5);
INSERT INTO widget(widget_inspector_id) VALUES (4);
INSERT INTO widget(widget_inspector_id) VALUES (6);
INSERT INTO widget(widget_inspector_id) VALUES (6);
INSERT INTO widget(widget_inspector_id) VALUES (2);
INSERT INTO widget(widget_inspector_id) VALUES (7);
INSERT INTO widget(widget_inspector_id) VALUES (1);
INSERT INTO widget(widget_inspector_id) VALUES (4);
INSERT INTO widget(widget_inspector_id) VALUES (4);
INSERT INTO widget(widget_inspector_id) VALUES (4);
INSERT INTO widget(widget_inspector_id) VALUES (3);
INSERT INTO widget(widget_inspector_id) VALUES (3);
INSERT INTO widget(widget_inspector_id) VALUES (5);
INSERT INTO widget(widget_inspector_id) VALUES (2);
INSERT INTO widget(widget_inspector_id) VALUES (5);
INSERT INTO widget(widget_inspector_id) VALUES (4);
INSERT INTO widget(widget_inspector_id) VALUES (1);
INSERT INTO widget(widget_inspector_id) VALUES (5);
INSERT INTO widget(widget_inspector_id) VALUES (5);
INSERT INTO widget(widget_inspector_id) VALUES (3);
INSERT INTO widget(widget_inspector_id) VALUES (2);
INSERT INTO widget(widget_inspector_id) VALUES (2);
INSERT INTO widget(widget_inspector_id) VALUES (4);
INSERT INTO widget(widget_inspector_id) VALUES (3);
INSERT INTO widget(widget_inspector_id) VALUES (6);
INSERT INTO widget(widget_inspector_id) VALUES (6);
INSERT INTO widget(widget_inspector_id) VALUES (5);
INSERT INTO widget(widget_inspector_id) VALUES (4);
INSERT INTO widget(widget_inspector_id) VALUES (2);
INSERT INTO widget(widget_inspector_id) VALUES (8);
INSERT INTO widget(widget_inspector_id) VALUES (4);
INSERT INTO widget(widget_inspector_id) VALUES (8);
INSERT INTO widget(widget_inspector_id) VALUES (4);
INSERT INTO widget(widget_inspector_id) VALUES (6);
INSERT INTO widget(widget_inspector_id) VALUES (3);
INSERT INTO widget(widget_inspector_id) VALUES (2);
INSERT INTO widget(widget_inspector_id) VALUES (6);
INSERT INTO widget(widget_inspector_id) VALUES (7);
INSERT INTO widget(widget_inspector_id) VALUES (7);
INSERT INTO widget(widget_inspector_id) VALUES (5);
INSERT INTO widget(widget_inspector_id) VALUES (4);
INSERT INTO widget(widget_inspector_id) VALUES (8);
INSERT INTO widget(widget_inspector_id) VALUES (7);
INSERT INTO widget(widget_inspector_id) VALUES (8);
INSERT INTO widget(widget_inspector_id) VALUES (3);
