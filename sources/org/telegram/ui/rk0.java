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
public final class rk0 extends org.telegram.ui.ActionBar.j {
    public final Context f37148a;
    public final vk0 f37149b;

    public rk0(vk0 vk0Var, Context context) {
        this.f37149b = vk0Var;
        this.f37148a = context;
    }

    @Override
    public final void b(int i10) {
        int i11;
        int i12;
        org.telegram.ui.ActionBar.l lVar;
        vk0 vk0Var = this.f37149b;
        org.telegram.ui.ActionBar.e6 e6Var = vk0Var.h;
        SparseArray sparseArray = vk0Var.J;
        if (i10 == -1) {
            lVar = ((org.telegram.ui.ActionBar.o2) vk0Var).actionBar;
            if (lVar.t()) {
                vk0.W(vk0Var);
                return;
            } else {
                vk0Var.finishFragment();
                return;
            }
        }
        if (i10 == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vk0Var.getParentActivity(), 0, e6Var);
            alertDialog$Builder.f18655a.R = LocaleController.formatPluralString("DeleteTones", sparseArray.size(), new Object[0]);
            alertDialog$Builder.f18655a.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString("DeleteTonesMessage", sparseArray.size(), new Object[0]));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.voip.e1(14));
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new qk0(this, 0));
            TextView textView = (TextView) alertDialog$Builder.o().d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19297q7, e6Var));
            }
        } else if (i10 == 2) {
            int size = sparseArray.size();
            Context context = this.f37148a;
            if (size == 1) {
                Intent intent = new Intent(context, LaunchActivity.class);
                intent.setAction("android.intent.action.SEND");
                i12 = ((org.telegram.ui.ActionBar.o2) vk0Var).currentAccount;
                Uri a2 = ((tk0) sparseArray.valueAt(0)).a(i12);
                if (a2 != null) {
                    intent.putExtra("android.intent.extra.STREAM", a2);
                    context.startActivity(intent);
                }
            } else {
                Intent intent2 = new Intent(context, LaunchActivity.class);
                intent2.setAction("android.intent.action.SEND_MULTIPLE");
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                    i11 = ((org.telegram.ui.ActionBar.o2) vk0Var).currentAccount;
                    Uri a10 = ((tk0) sparseArray.valueAt(i13)).a(i11);
                    if (a10 != null) {
                        arrayList.add(a10);
                    }
                }
                if (!arrayList.isEmpty()) {
                    intent2.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
                    context.startActivity(intent2);
                }
            }
            vk0.W(vk0Var);
            vk0Var.c0();
            vk0Var.f38628f.l();
        }
    }
}
