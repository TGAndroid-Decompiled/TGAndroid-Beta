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
public final class xk0 extends org.telegram.ui.ActionBar.j {
    public final Context f39632a;
    public final bl0 f39633b;

    public xk0(bl0 bl0Var, Context context) {
        this.f39633b = bl0Var;
        this.f39632a = context;
    }

    @Override
    public final void b(int i10) {
        int i11;
        int i12;
        org.telegram.ui.ActionBar.k kVar;
        bl0 bl0Var = this.f39633b;
        org.telegram.ui.ActionBar.f6 f6Var = bl0Var.h;
        SparseArray sparseArray = bl0Var.J;
        if (i10 == -1) {
            kVar = ((org.telegram.ui.ActionBar.n2) bl0Var).actionBar;
            if (kVar.s()) {
                bl0.W(bl0Var);
                return;
            } else {
                bl0Var.finishFragment();
                return;
            }
        }
        if (i10 == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bl0Var.getParentActivity(), 0, f6Var);
            alertDialog$Builder.f18669a.R = LocaleController.formatPluralString("DeleteTones", sparseArray.size(), new Object[0]);
            alertDialog$Builder.f18669a.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString("DeleteTonesMessage", sparseArray.size(), new Object[0]));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ja0(2));
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new fu(this, 29));
            TextView textView = (TextView) alertDialog$Builder.o().d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19348q7, f6Var));
            }
        } else if (i10 == 2) {
            int size = sparseArray.size();
            Context context = this.f39632a;
            if (size == 1) {
                Intent intent = new Intent(context, LaunchActivity.class);
                intent.setAction("android.intent.action.SEND");
                i12 = ((org.telegram.ui.ActionBar.n2) bl0Var).currentAccount;
                Uri a2 = ((zk0) sparseArray.valueAt(0)).a(i12);
                if (a2 != null) {
                    intent.putExtra("android.intent.extra.STREAM", a2);
                    context.startActivity(intent);
                }
            } else {
                Intent intent2 = new Intent(context, LaunchActivity.class);
                intent2.setAction("android.intent.action.SEND_MULTIPLE");
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                    i11 = ((org.telegram.ui.ActionBar.n2) bl0Var).currentAccount;
                    Uri a10 = ((zk0) sparseArray.valueAt(i13)).a(i11);
                    if (a10 != null) {
                        arrayList.add(a10);
                    }
                }
                if (!arrayList.isEmpty()) {
                    intent2.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
                    context.startActivity(intent2);
                }
            }
            bl0.W(bl0Var);
            bl0Var.c0();
            bl0Var.f32506f.l();
        }
    }
}
