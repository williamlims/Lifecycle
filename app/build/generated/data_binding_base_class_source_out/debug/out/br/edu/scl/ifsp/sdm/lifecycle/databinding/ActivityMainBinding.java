// Generated by view binder compiler. Do not edit!
package br.edu.scl.ifsp.sdm.lifecycle.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import br.edu.scl.ifsp.sdm.lifecycle.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageButton addPhoneBt;

  @NonNull
  public final TextView filledCharsTv;

  @NonNull
  public final EditText nameEt;

  @NonNull
  public final ImageButton openAnotherActivityBt;

  @NonNull
  public final TilePhoneBinding phone;

  @NonNull
  public final LinearLayout phonesLl;

  @NonNull
  public final ToolbarBinding toolbarIn;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView, @NonNull ImageButton addPhoneBt,
      @NonNull TextView filledCharsTv, @NonNull EditText nameEt,
      @NonNull ImageButton openAnotherActivityBt, @NonNull TilePhoneBinding phone,
      @NonNull LinearLayout phonesLl, @NonNull ToolbarBinding toolbarIn) {
    this.rootView = rootView;
    this.addPhoneBt = addPhoneBt;
    this.filledCharsTv = filledCharsTv;
    this.nameEt = nameEt;
    this.openAnotherActivityBt = openAnotherActivityBt;
    this.phone = phone;
    this.phonesLl = phonesLl;
    this.toolbarIn = toolbarIn;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.addPhoneBt;
      ImageButton addPhoneBt = ViewBindings.findChildViewById(rootView, id);
      if (addPhoneBt == null) {
        break missingId;
      }

      id = R.id.filledCharsTv;
      TextView filledCharsTv = ViewBindings.findChildViewById(rootView, id);
      if (filledCharsTv == null) {
        break missingId;
      }

      id = R.id.nameEt;
      EditText nameEt = ViewBindings.findChildViewById(rootView, id);
      if (nameEt == null) {
        break missingId;
      }

      id = R.id.openAnotherActivityBt;
      ImageButton openAnotherActivityBt = ViewBindings.findChildViewById(rootView, id);
      if (openAnotherActivityBt == null) {
        break missingId;
      }

      id = R.id.phone;
      View phone = ViewBindings.findChildViewById(rootView, id);
      if (phone == null) {
        break missingId;
      }
      TilePhoneBinding binding_phone = TilePhoneBinding.bind(phone);

      id = R.id.phonesLl;
      LinearLayout phonesLl = ViewBindings.findChildViewById(rootView, id);
      if (phonesLl == null) {
        break missingId;
      }

      id = R.id.toolbarIn;
      View toolbarIn = ViewBindings.findChildViewById(rootView, id);
      if (toolbarIn == null) {
        break missingId;
      }
      ToolbarBinding binding_toolbarIn = ToolbarBinding.bind(toolbarIn);

      return new ActivityMainBinding((ConstraintLayout) rootView, addPhoneBt, filledCharsTv, nameEt,
          openAnotherActivityBt, binding_phone, phonesLl, binding_toolbarIn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}