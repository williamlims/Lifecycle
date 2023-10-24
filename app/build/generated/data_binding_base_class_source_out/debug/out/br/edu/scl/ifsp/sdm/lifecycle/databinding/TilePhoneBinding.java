// Generated by view binder compiler. Do not edit!
package br.edu.scl.ifsp.sdm.lifecycle.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import br.edu.scl.ifsp.sdm.lifecycle.R;
import java.lang.NullPointerException;
import java.lang.Override;

public final class TilePhoneBinding implements ViewBinding {
  @NonNull
  private final EditText rootView;

  private TilePhoneBinding(@NonNull EditText rootView) {
    this.rootView = rootView;
  }

  @Override
  @NonNull
  public EditText getRoot() {
    return rootView;
  }

  @NonNull
  public static TilePhoneBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static TilePhoneBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.tile_phone, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static TilePhoneBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    return new TilePhoneBinding((EditText) rootView);
  }
}
