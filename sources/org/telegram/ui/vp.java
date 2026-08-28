package org.telegram.ui;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class vp implements DialogInterface.OnShowListener {
    public final int f43558a;
    public final View f43559b;

    public vp(int i9, View view) {
        this.f43558a = i9;
        this.f43559b = view;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f43558a) {
            case 0:
                DatePicker datePicker = (DatePicker) this.f43559b;
                int childCount = datePicker.getChildCount();
                for (int i9 = 0; i9 < childCount; i9++) {
                    View childAt = datePicker.getChildAt(i9);
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    layoutParams.width = -1;
                    childAt.setLayoutParams(layoutParams);
                }
                return;
            default:
                AndroidUtilities.runOnUIThread(new yg(1, (EditTextBoldCursor) this.f43559b));
                return;
        }
    }
}
