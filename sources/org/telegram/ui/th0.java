package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.util.SparseArray;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class th0 extends org.telegram.ui.ActionBar.j {
    public final Context f52407a;
    public final wh0 f52408b;

    public th0(wh0 wh0Var, Context context) {
        this.f52408b = wh0Var;
        this.f52407a = context;
    }

    @Override
    public final void b(int i7) {
        int i10;
        int i11;
        org.telegram.ui.ActionBar.z4 z4Var;
        wh0 wh0Var = this.f52408b;
        org.telegram.ui.ActionBar.i6 i6Var = wh0Var.f53686f;
        SparseArray sparseArray = wh0Var.J;
        if (i7 == -1) {
            z4Var = ((org.telegram.ui.ActionBar.g2) wh0Var).simpleActionBar;
            if (z4Var.x()) {
                wh0.b0(wh0Var);
                return;
            } else {
                wh0Var.finishFragment();
                return;
            }
        }
        if (i7 == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wh0Var.getParentActivity(), i6Var);
            String G = org.telegram.messenger.gd.G(sparseArray.size(), "DeleteTones", new Object[0]);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
            t1Var.S = G;
            t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.G(sparseArray.size(), "DeleteTonesMessage", new Object[0]));
            alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), new l60(4));
            alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751586, null), new zr(this, 28));
            TextView textView = (TextView) alertDialog$Builder.p().d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29692q7, i6Var);
            }
        } else if (i7 == 2) {
            int size = sparseArray.size();
            Context context = this.f52407a;
            if (size == 1) {
                Intent intent = new Intent(context, LaunchActivity.class);
                intent.setAction("android.intent.action.SEND");
                i11 = ((org.telegram.ui.ActionBar.g2) wh0Var).currentAccount;
                Uri a10 = ((uh0) sparseArray.valueAt(0)).a(i11);
                if (a10 != null) {
                    intent.putExtra("android.intent.extra.STREAM", a10);
                    context.startActivity(intent);
                }
            } else {
                Intent intent2 = new Intent(context, LaunchActivity.class);
                intent2.setAction("android.intent.action.SEND_MULTIPLE");
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (int i12 = 0; i12 < sparseArray.size(); i12++) {
                    i10 = ((org.telegram.ui.ActionBar.g2) wh0Var).currentAccount;
                    Uri a11 = ((uh0) sparseArray.valueAt(i12)).a(i10);
                    if (a11 != null) {
                        arrayList.add(a11);
                    }
                }
                if (!arrayList.isEmpty()) {
                    intent2.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
                    context.startActivity(intent2);
                }
            }
            wh0.b0(wh0Var);
            wh0Var.i0();
            wh0Var.f53685e.f();
        }
    }
}
