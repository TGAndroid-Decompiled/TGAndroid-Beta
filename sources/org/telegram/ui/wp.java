package org.telegram.ui;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class wp implements DialogInterface.OnShowListener {
    public final int f42940a;
    public final View f42941b;

    public wp(int i10, View view) {
        this.f42940a = i10;
        this.f42941b = view;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f42940a) {
            case 0:
                DatePicker datePicker = (DatePicker) this.f42941b;
                int childCount = datePicker.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = datePicker.getChildAt(i10);
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    layoutParams.width = -1;
                    childAt.setLayoutParams(layoutParams);
                }
                return;
            default:
                AndroidUtilities.runOnUIThread(new ah(1, (EditTextBoldCursor) this.f42941b));
                return;
        }
    }
}
