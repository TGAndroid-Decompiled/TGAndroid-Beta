package org.telegram.ui;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class yp implements DialogInterface.OnShowListener {
    public final int f44952a;
    public final View f44953b;

    public yp(int i10, View view) {
        this.f44952a = i10;
        this.f44953b = view;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f44952a) {
            case 0:
                DatePicker datePicker = (DatePicker) this.f44953b;
                int childCount = datePicker.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = datePicker.getChildAt(i10);
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    layoutParams.width = -1;
                    childAt.setLayoutParams(layoutParams);
                }
                return;
            default:
                AndroidUtilities.runOnUIThread(new xg(1, (EditTextBoldCursor) this.f44953b));
                return;
        }
    }
}
