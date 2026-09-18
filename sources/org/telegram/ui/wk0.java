package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.util.SparseArray;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class wk0 extends org.telegram.ui.ActionBar.j {
    public final Context f39074a;
    public final al0 f39075b;

    public wk0(al0 al0Var, Context context) {
        this.f39075b = al0Var;
        this.f39074a = context;
    }

    @Override
    public final void b(int i10) {
        int i11;
        int i12;
        org.telegram.ui.ActionBar.k kVar;
        al0 al0Var = this.f39075b;
        org.telegram.ui.ActionBar.f6 f6Var = al0Var.h;
        SparseArray sparseArray = al0Var.J;
        if (i10 == -1) {
            kVar = ((org.telegram.ui.ActionBar.o2) al0Var).actionBar;
            if (kVar.s()) {
                al0.W(al0Var);
                return;
            } else {
                al0Var.finishFragment();
                return;
            }
        }
        if (i10 == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(al0Var.getParentActivity(), 0, f6Var);
            alertDialog$Builder.f18447a.R = LocaleController.formatPluralString("DeleteTones", sparseArray.size(), new Object[0]);
            alertDialog$Builder.f18447a.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString("DeleteTonesMessage", sparseArray.size(), new Object[0]));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.bn0(28));
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new gu(this, 29));
            TextView textView = (TextView) alertDialog$Builder.o().d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19101q7, f6Var));
            }
        } else if (i10 == 2) {
            int size = sparseArray.size();
            Context context = this.f39074a;
            if (size == 1) {
                Intent intent = new Intent(context, LaunchActivity.class);
                intent.setAction("android.intent.action.SEND");
                i12 = ((org.telegram.ui.ActionBar.o2) al0Var).currentAccount;
                Uri a2 = ((yk0) sparseArray.valueAt(0)).a(i12);
                if (a2 != null) {
                    intent.putExtra("android.intent.extra.STREAM", a2);
                    context.startActivity(intent);
                }
            } else {
                Intent intent2 = new Intent(context, LaunchActivity.class);
                intent2.setAction("android.intent.action.SEND_MULTIPLE");
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                    i11 = ((org.telegram.ui.ActionBar.o2) al0Var).currentAccount;
                    Uri a10 = ((yk0) sparseArray.valueAt(i13)).a(i11);
                    if (a10 != null) {
                        arrayList.add(a10);
                    }
                }
                if (!arrayList.isEmpty()) {
                    intent2.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
                    context.startActivity(intent2);
                }
            }
            al0.W(al0Var);
            al0Var.c0();
            al0Var.f31920f.l();
        }
    }
}
