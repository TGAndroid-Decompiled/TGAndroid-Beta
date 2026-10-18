package org.telegram.ui;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class yp implements DialogInterface.OnShowListener {
    public final int f43489a;
    public final View f43490b;

    public yp(int i10, View view) {
        this.f43489a = i10;
        this.f43490b = view;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f43489a) {
            case 0:
                DatePicker datePicker = (DatePicker) this.f43490b;
                int childCount = datePicker.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = datePicker.getChildAt(i10);
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    layoutParams.width = -1;
                    childAt.setLayoutParams(layoutParams);
                }
                return;
            default:
                AndroidUtilities.runOnUIThread(new ch(1, (EditTextBoldCursor) this.f43490b));
                return;
        }
    }
}
