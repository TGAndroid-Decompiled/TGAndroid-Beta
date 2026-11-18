package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.util.SparseArray;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class uh0 extends org.telegram.ui.ActionBar.j {
    public final Context f52569a;
    public final xh0 f52570b;

    public uh0(xh0 xh0Var, Context context) {
        this.f52570b = xh0Var;
        this.f52569a = context;
    }

    @Override
    public final void b(int i7) {
        int i10;
        int i11;
        org.telegram.ui.ActionBar.a5 a5Var;
        xh0 xh0Var = this.f52570b;
        org.telegram.ui.ActionBar.i6 i6Var = xh0Var.f53861f;
        SparseArray sparseArray = xh0Var.J;
        if (i7 == -1) {
            a5Var = ((org.telegram.ui.ActionBar.h2) xh0Var).simpleActionBar;
            if (a5Var.x()) {
                xh0.b0(xh0Var);
                return;
            } else {
                xh0Var.finishFragment();
                return;
            }
        }
        if (i7 == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, xh0Var.getParentActivity(), i6Var);
            String G = org.telegram.messenger.gd.G(sparseArray.size(), "DeleteTones", new Object[0]);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
            u1Var.S = G;
            u1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.G(sparseArray.size(), "DeleteTonesMessage", new Object[0]));
            alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), new l60(4));
            alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751587, null), new zr(this, 28));
            TextView textView = (TextView) alertDialog$Builder.p().d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29637q7, i6Var);
            }
        } else if (i7 == 2) {
            int size = sparseArray.size();
            Context context = this.f52569a;
            if (size == 1) {
                Intent intent = new Intent(context, LaunchActivity.class);
                intent.setAction("android.intent.action.SEND");
                i11 = ((org.telegram.ui.ActionBar.h2) xh0Var).currentAccount;
                Uri a10 = ((vh0) sparseArray.valueAt(0)).a(i11);
                if (a10 != null) {
                    intent.putExtra("android.intent.extra.STREAM", a10);
                    context.startActivity(intent);
                }
            } else {
                Intent intent2 = new Intent(context, LaunchActivity.class);
                intent2.setAction("android.intent.action.SEND_MULTIPLE");
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (int i12 = 0; i12 < sparseArray.size(); i12++) {
                    i10 = ((org.telegram.ui.ActionBar.h2) xh0Var).currentAccount;
                    Uri a11 = ((vh0) sparseArray.valueAt(i12)).a(i10);
                    if (a11 != null) {
                        arrayList.add(a11);
                    }
                }
                if (!arrayList.isEmpty()) {
                    intent2.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
                    context.startActivity(intent2);
                }
            }
            xh0.b0(xh0Var);
            xh0Var.i0();
            xh0Var.f53860e.f();
        }
    }
}
