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
public final class uk0 extends org.telegram.ui.ActionBar.j {
    public final Context f38049a;
    public final yk0 f38050b;

    public uk0(yk0 yk0Var, Context context) {
        this.f38050b = yk0Var;
        this.f38049a = context;
    }

    @Override
    public final void b(int i10) {
        int i11;
        int i12;
        org.telegram.ui.ActionBar.k kVar;
        yk0 yk0Var = this.f38050b;
        org.telegram.ui.ActionBar.e6 e6Var = yk0Var.h;
        SparseArray sparseArray = yk0Var.J;
        if (i10 == -1) {
            kVar = ((org.telegram.ui.ActionBar.n2) yk0Var).actionBar;
            if (kVar.s()) {
                yk0.W(yk0Var);
                return;
            } else {
                yk0Var.finishFragment();
                return;
            }
        }
        if (i10 == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yk0Var.getParentActivity(), 0, e6Var);
            alertDialog$Builder.f18437a.R = LocaleController.formatPluralString("DeleteTones", sparseArray.size(), new Object[0]);
            alertDialog$Builder.f18437a.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString("DeleteTonesMessage", sparseArray.size(), new Object[0]));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.an0(28));
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new hu(this, 28));
            TextView textView = (TextView) alertDialog$Builder.o().d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19074q7, e6Var));
            }
        } else if (i10 == 2) {
            int size = sparseArray.size();
            Context context = this.f38049a;
            if (size == 1) {
                Intent intent = new Intent(context, LaunchActivity.class);
                intent.setAction("android.intent.action.SEND");
                i12 = ((org.telegram.ui.ActionBar.n2) yk0Var).currentAccount;
                Uri a2 = ((wk0) sparseArray.valueAt(0)).a(i12);
                if (a2 != null) {
                    intent.putExtra("android.intent.extra.STREAM", a2);
                    context.startActivity(intent);
                }
            } else {
                Intent intent2 = new Intent(context, LaunchActivity.class);
                intent2.setAction("android.intent.action.SEND_MULTIPLE");
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                    i11 = ((org.telegram.ui.ActionBar.n2) yk0Var).currentAccount;
                    Uri a10 = ((wk0) sparseArray.valueAt(i13)).a(i11);
                    if (a10 != null) {
                        arrayList.add(a10);
                    }
                }
                if (!arrayList.isEmpty()) {
                    intent2.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
                    context.startActivity(intent2);
                }
            }
            yk0.W(yk0Var);
            yk0Var.c0();
            yk0Var.f39927f.l();
        }
    }
}
