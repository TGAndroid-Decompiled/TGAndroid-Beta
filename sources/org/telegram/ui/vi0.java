package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.util.SparseArray;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class vi0 extends org.telegram.ui.ActionBar.k {
    public final Context f42733a;
    public final yi0 f42734b;

    public vi0(yi0 yi0Var, Context context) {
        this.f42734b = yi0Var;
        this.f42733a = context;
    }

    @Override
    public final void b(int i10) {
        int i11;
        int i12;
        org.telegram.ui.ActionBar.i5 i5Var;
        yi0 yi0Var = this.f42734b;
        org.telegram.ui.ActionBar.p6 p6Var = yi0Var.f43849f;
        SparseArray sparseArray = yi0Var.I;
        if (i10 == -1) {
            i5Var = ((org.telegram.ui.ActionBar.k2) yi0Var).simpleActionBar;
            if (i5Var.s()) {
                yi0.a0(yi0Var);
                return;
            } else {
                yi0Var.finishFragment();
                return;
            }
        }
        if (i10 == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, yi0Var.getParentActivity(), p6Var);
            String G = org.telegram.messenger.cd.G(sparseArray.size(), "DeleteTones", new Object[0]);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
            x1Var.R = G;
            x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.G(sparseArray.size(), "DeleteTonesMessage", new Object[0]));
            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), new org.telegram.ui.Components.z11(17));
            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751599, null), new tt(this, 28));
            TextView textView = (TextView) alertDialog$Builder.p().d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21170q7, p6Var);
            }
        } else if (i10 == 2) {
            int size = sparseArray.size();
            Context context = this.f42733a;
            if (size == 1) {
                Intent intent = new Intent(context, LaunchActivity.class);
                intent.setAction("android.intent.action.SEND");
                i12 = ((org.telegram.ui.ActionBar.k2) yi0Var).currentAccount;
                Uri a2 = ((wi0) sparseArray.valueAt(0)).a(i12);
                if (a2 != null) {
                    intent.putExtra("android.intent.extra.STREAM", a2);
                    context.startActivity(intent);
                }
            } else {
                Intent intent2 = new Intent(context, LaunchActivity.class);
                intent2.setAction("android.intent.action.SEND_MULTIPLE");
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                    i11 = ((org.telegram.ui.ActionBar.k2) yi0Var).currentAccount;
                    Uri a10 = ((wi0) sparseArray.valueAt(i13)).a(i11);
                    if (a10 != null) {
                        arrayList.add(a10);
                    }
                }
                if (!arrayList.isEmpty()) {
                    intent2.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
                    context.startActivity(intent2);
                }
            }
            yi0.a0(yi0Var);
            yi0Var.h0();
            yi0Var.e.f();
        }
    }
}
