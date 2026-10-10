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
    public final Context f43745a;
    public final al0 f43746b;

    public wk0(al0 al0Var, Context context) {
        this.f43746b = al0Var;
        this.f43745a = context;
    }

    @Override
    public final void b(int i10) {
        int i11;
        int i12;
        org.telegram.ui.ActionBar.k kVar;
        al0 al0Var = this.f43746b;
        org.telegram.ui.ActionBar.e6 e6Var = al0Var.h;
        SparseArray sparseArray = al0Var.J;
        if (i10 == -1) {
            kVar = ((org.telegram.ui.ActionBar.n2) al0Var).actionBar;
            if (kVar.t()) {
                al0.W(al0Var);
                return;
            } else {
                al0Var.finishFragment();
                return;
            }
        }
        if (i10 == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(al0Var.getParentActivity(), 0, e6Var);
            alertDialog$Builder.f20378a.R = LocaleController.formatPluralString("DeleteTones", sparseArray.size(), new Object[0]);
            alertDialog$Builder.f20378a.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString("DeleteTonesMessage", sparseArray.size(), new Object[0]));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new a80(4));
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new gu(this, 27));
            TextView textView = (TextView) alertDialog$Builder.o().d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21041q7, e6Var));
            }
        } else if (i10 == 2) {
            int size = sparseArray.size();
            Context context = this.f43745a;
            if (size == 1) {
                Intent intent = new Intent(context, LaunchActivity.class);
                intent.setAction("android.intent.action.SEND");
                i12 = ((org.telegram.ui.ActionBar.n2) al0Var).currentAccount;
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
                    i11 = ((org.telegram.ui.ActionBar.n2) al0Var).currentAccount;
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
            al0Var.f36001f.l();
        }
    }
}
