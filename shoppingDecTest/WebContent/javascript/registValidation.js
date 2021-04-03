function formValidation(){
  var name = document.registration.name;
  var email = document.registration.email;
  var phone = document.registration.phone;
  var username = document.registration.uid;
  var password = document.registration.psw;

  if (name_validation(name)) {
    if (email_validation(email)) {
      if (phone_validation(phone)) {
        if (username_validation(username)) {
          if (password_validation(password)) {

          }
        }
      }
    }
  }
  return false;
}

// name_validation
function name_validation(name) {
  var length = name.value.length;

  if (length == 0) {
    alert("Name criteria must be filled");
    name.focus();
    return false;
  }

  return true;

}

// email_validation
function email_validation(email) {
  var length = email.value.length;

  if (length == 0) {
    alert("Email criteria must be filled");
    email.focus();
    return false;
  }

  return true;

}

// phone_number_validation
function phone_validation(phone) {
  var length = phone.value.length;

  if (length == 0) {
    alert("Phone number criteria must be filled");
    phone.focus();
    return false;
  }

  return true;

}

// username_validation
function username_validation(username) {
  var length = username.value.length;

  if (length == 0) {
    alert("Username criteria must be filled");
    uid.focus();
    return false;
  }

  return true;

}

function password_validation(password) {
  var length = password.value.length;

  if (length == 0) {
    alert("Password criteria must be filled");
    psw.focus();
    return false;
  }

  return true;

}
