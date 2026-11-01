package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.util.SparseArray;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ti0 extends org.telegram.ui.ActionBar.k {
    public final Context f41647a;
    public final wi0 f41648b;

    public ti0(wi0 wi0Var, Context context) {
        this.f41648b = wi0Var;
        this.f41647a = context;
    }

    @Override
    public final void b(int i10) {
        int i11;
        int i12;
        org.telegram.ui.ActionBar.i5 i5Var;
        wi0 wi0Var = this.f41648b;
        org.telegram.ui.ActionBar.p6 p6Var = wi0Var.f43114f;
        SparseArray sparseArray = wi0Var.I;
        if (i10 == -1) {
            i5Var = ((org.telegram.ui.ActionBar.k2) wi0Var).simpleActionBar;
            if (i5Var.s()) {
                wi0.b0(wi0Var);
                return;
            } else {
                wi0Var.finishFragment();
                return;
            }
        }
        if (i10 == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wi0Var.getParentActivity(), p6Var);
            String G = org.telegram.messenger.dd.G(sparseArray.size(), "DeleteTones", new Object[0]);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
            x1Var.R = G;
            x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.dd.G(sparseArray.size(), "DeleteTonesMessage", new Object[0]));
            alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), new org.telegram.ui.Components.a21(17));
            alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751599, null), new st(this, 28));
            TextView textView = (TextView) alertDialog$Builder.p().d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21171q7, p6Var);
            }
        } else if (i10 == 2) {
            int size = sparseArray.size();
            Context context = this.f41647a;
            if (size == 1) {
                Intent intent = new Intent(context, LaunchActivity.class);
                intent.setAction("android.intent.action.SEND");
                i12 = ((org.telegram.ui.ActionBar.k2) wi0Var).currentAccount;
                Uri a2 = ((ui0) sparseArray.valueAt(0)).a(i12);
                if (a2 != null) {
                    intent.putExtra("android.intent.extra.STREAM", a2);
                    context.startActivity(intent);
                }
            } else {
                Intent intent2 = new Intent(context, LaunchActivity.class);
                intent2.setAction("android.intent.action.SEND_MULTIPLE");
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                    i11 = ((org.telegram.ui.ActionBar.k2) wi0Var).currentAccount;
                    Uri a10 = ((ui0) sparseArray.valueAt(i13)).a(i11);
                    if (a10 != null) {
                        arrayList.add(a10);
                    }
                }
                if (!arrayList.isEmpty()) {
                    intent2.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
                    context.startActivity(intent2);
                }
            }
            wi0.b0(wi0Var);
            wi0Var.i0();
            wi0Var.e.f();
        }
    }
}
