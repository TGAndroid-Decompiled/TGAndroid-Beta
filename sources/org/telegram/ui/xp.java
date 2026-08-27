package org.telegram.ui;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

public final class xp implements DialogInterface.OnShowListener {

    public final int f44590a;

    public final View f44591b;

    public xp(int i10, View view) {
        this.f44590a = i10;
        this.f44591b = view;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f44590a) {
            case 0:
                DatePicker datePicker = (DatePicker) this.f44591b;
                int childCount = datePicker.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = datePicker.getChildAt(i10);
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    layoutParams.width = -1;
                    childAt.setLayoutParams(layoutParams);
                }
                break;
            default:
                AndroidUtilities.runOnUIThread(new ah(1, (EditTextBoldCursor) this.f44591b));
                break;
        }
    }
}
