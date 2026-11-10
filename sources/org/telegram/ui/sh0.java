package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.util.SparseArray;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class sh0 extends org.telegram.ui.ActionBar.k {
    public final Context f49854a;
    public final vh0 f49855b;

    public sh0(vh0 vh0Var, Context context) {
        this.f49855b = vh0Var;
        this.f49854a = context;
    }

    @Override
    public final void b(int i7) {
        int i10;
        int i11;
        org.telegram.ui.ActionBar.z4 z4Var;
        vh0 vh0Var = this.f49855b;
        org.telegram.ui.ActionBar.h6 h6Var = vh0Var.f50731f;
        SparseArray sparseArray = vh0Var.I;
        if (i7 == -1) {
            z4Var = ((org.telegram.ui.ActionBar.f2) vh0Var).simpleActionBar;
            if (z4Var.u()) {
                vh0.b0(vh0Var);
                return;
            } else {
                vh0Var.finishFragment();
                return;
            }
        }
        if (i7 == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vh0Var.getParentActivity(), h6Var);
            String G = org.telegram.messenger.id.G(sparseArray.size(), "DeleteTones", new Object[0]);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
            u1Var.R = G;
            u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.G(sparseArray.size(), "DeleteTonesMessage", new Object[0]));
            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), new org.telegram.ui.Components.il0(27));
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751598, null), new zr(this, 28));
            TextView textView = (TextView) alertDialog$Builder.p().d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f28131q7, h6Var);
            }
        } else if (i7 == 2) {
            int size = sparseArray.size();
            Context context = this.f49854a;
            if (size == 1) {
                Intent intent = new Intent(context, LaunchActivity.class);
                intent.setAction("android.intent.action.SEND");
                i11 = ((org.telegram.ui.ActionBar.f2) vh0Var).currentAccount;
                Uri a10 = ((th0) sparseArray.valueAt(0)).a(i11);
                if (a10 != null) {
                    intent.putExtra("android.intent.extra.STREAM", a10);
                    context.startActivity(intent);
                }
            } else {
                Intent intent2 = new Intent(context, LaunchActivity.class);
                intent2.setAction("android.intent.action.SEND_MULTIPLE");
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (int i12 = 0; i12 < sparseArray.size(); i12++) {
                    i10 = ((org.telegram.ui.ActionBar.f2) vh0Var).currentAccount;
                    Uri a11 = ((th0) sparseArray.valueAt(i12)).a(i10);
                    if (a11 != null) {
                        arrayList.add(a11);
                    }
                }
                if (!arrayList.isEmpty()) {
                    intent2.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
                    context.startActivity(intent2);
                }
            }
            vh0.b0(vh0Var);
            vh0Var.i0();
            vh0Var.f50730e.f();
        }
    }
}
