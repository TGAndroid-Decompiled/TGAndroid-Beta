package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.util.SparseArray;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class rh0 extends org.telegram.ui.ActionBar.j {
    public final Context f50955a;
    public final uh0 f50956b;

    public rh0(uh0 uh0Var, Context context) {
        this.f50956b = uh0Var;
        this.f50955a = context;
    }

    @Override
    public final void b(int i7) {
        int i10;
        int i11;
        org.telegram.ui.ActionBar.w4 w4Var;
        uh0 uh0Var = this.f50956b;
        org.telegram.ui.ActionBar.e6 e6Var = uh0Var.f51951f;
        SparseArray sparseArray = uh0Var.J;
        if (i7 == -1) {
            w4Var = ((org.telegram.ui.ActionBar.e2) uh0Var).simpleActionBar;
            if (w4Var.v()) {
                uh0.b0(uh0Var);
                return;
            } else {
                uh0Var.finishFragment();
                return;
            }
        }
        if (i7 == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, uh0Var.getParentActivity(), e6Var);
            String G = org.telegram.messenger.hd.G(sparseArray.size(), "DeleteTones", new Object[0]);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
            t1Var.S = G;
            t1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G(sparseArray.size(), "DeleteTonesMessage", new Object[0]));
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), new t70(3));
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751598, null), new zr(this, 28));
            TextView textView = (TextView) alertDialog$Builder.p().d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29090q7, e6Var);
            }
        } else if (i7 == 2) {
            int size = sparseArray.size();
            Context context = this.f50955a;
            if (size == 1) {
                Intent intent = new Intent(context, LaunchActivity.class);
                intent.setAction("android.intent.action.SEND");
                i11 = ((org.telegram.ui.ActionBar.e2) uh0Var).currentAccount;
                Uri a10 = ((sh0) sparseArray.valueAt(0)).a(i11);
                if (a10 != null) {
                    intent.putExtra("android.intent.extra.STREAM", a10);
                    context.startActivity(intent);
                }
            } else {
                Intent intent2 = new Intent(context, LaunchActivity.class);
                intent2.setAction("android.intent.action.SEND_MULTIPLE");
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (int i12 = 0; i12 < sparseArray.size(); i12++) {
                    i10 = ((org.telegram.ui.ActionBar.e2) uh0Var).currentAccount;
                    Uri a11 = ((sh0) sparseArray.valueAt(i12)).a(i10);
                    if (a11 != null) {
                        arrayList.add(a11);
                    }
                }
                if (!arrayList.isEmpty()) {
                    intent2.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
                    context.startActivity(intent2);
                }
            }
            uh0.b0(uh0Var);
            uh0Var.i0();
            uh0Var.f51950e.f();
        }
    }
}
