package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class x9 extends org.telegram.ui.ActionBar.d2 {
    public w9 f51892a;
    public w9 f51893b;
    public org.telegram.ui.ActionBar.q0 f51894c;
    public org.telegram.ui.ActionBar.e6 d;

    public static void Z(x9 x9Var) {
        String str;
        TLRPC.User f10 = org.telegram.messenger.h10.i(x9Var.currentAccount).f();
        if (f10 != null && x9Var.f51893b.getText() != null && x9Var.f51892a.getText() != null) {
            String obj = x9Var.f51892a.getText().toString();
            String obj2 = x9Var.f51893b.getText().toString();
            String str2 = f10.first_name;
            if (str2 == null || !str2.equals(obj) || (str = f10.last_name) == null || !str.equals(obj2)) {
                TL_account.updateProfile updateprofile = new TL_account.updateProfile();
                updateprofile.flags = 3;
                updateprofile.first_name = obj;
                f10.first_name = obj;
                updateprofile.last_name = obj2;
                f10.last_name = obj2;
                TLRPC.User a22 = org.telegram.messenger.hp.s1(x9Var.currentAccount).a2(Long.valueOf(org.telegram.messenger.h10.i(x9Var.currentAccount).e()));
                if (a22 != null) {
                    a22.first_name = updateprofile.first_name;
                    a22.last_name = updateprofile.last_name;
                }
                org.telegram.messenger.h10.i(x9Var.currentAccount).v(true);
                org.telegram.messenger.hs.f(x9Var.currentAccount).k(org.telegram.messenger.hs.f23248j0, new Object[0]);
                org.telegram.messenger.hs.f(x9Var.currentAccount).k(org.telegram.messenger.hs.f23292r, 1);
                ConnectionsManager.getInstance(x9Var.currentAccount).sendRequest(updateprofile, new ei.u5(9));
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28179t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28160s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27878d6));
    }

    @Override
    public final View createView(Context context) {
        int i3;
        int i10;
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 3, org.telegram.ui.ActionBar.k6.f27919f8, e6Var);
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 1, org.telegram.ui.ActionBar.k6.f28216v8, e6Var);
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131751265, null));
        this.actionBar.setActionBarMenuOnItemClick(new o9(this, 1));
        this.f51894c = this.actionBar.q().h(1, 2131231242, org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.bd.M0(2131751355, null));
        TLRPC.User a22 = org.telegram.messenger.hp.s1(this.currentAccount).a2(Long.valueOf(org.telegram.messenger.h10.i(this.currentAccount).e()));
        if (a22 == null) {
            a22 = org.telegram.messenger.h10.i(this.currentAccount).f();
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.fragmentView = linearLayout;
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ((LinearLayout) this.fragmentView).setOrientation(1);
        this.fragmentView.setOnTouchListener(new fi.a(2));
        w9 w9Var = new w9(this, context, 0);
        this.f51892a = w9Var;
        w9Var.setTextSize(1, 18.0f);
        w9 w9Var2 = this.f51892a;
        int i11 = org.telegram.ui.ActionBar.k6.H6;
        org.telegram.ui.ActionBar.r6.E(w9Var2, i11, e6Var);
        w9 w9Var3 = this.f51892a;
        int i12 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(w9Var3, i12, e6Var);
        this.f51892a.setBackgroundDrawable(null);
        w9 w9Var4 = this.f51892a;
        int i13 = org.telegram.ui.ActionBar.k6.f28007k6;
        int i14 = org.telegram.ui.ActionBar.k6.f28026l6;
        int i15 = org.telegram.ui.ActionBar.k6.f28102p7;
        org.telegram.ui.ActionBar.r6.G(w9Var4, i13, i14, i15, e6Var);
        this.f51892a.setMaxLines(1);
        this.f51892a.setLines(1);
        this.f51892a.setSingleLine(true);
        w9 w9Var5 = this.f51892a;
        if (org.telegram.messenger.bd.f21784a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        w9Var5.setGravity(i3);
        this.f51892a.setInputType(49152);
        this.f51892a.setImeOptions(5);
        this.f51892a.setHint(org.telegram.messenger.bd.M0(2131750695, null));
        org.telegram.ui.ActionBar.r6.w(this.f51892a, i12, e6Var);
        this.f51892a.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        this.f51892a.setCursorWidth(1.5f);
        linearLayout.addView(this.f51892a, b8.mf.k(24.0f, 24.0f, 24.0f, 0.0f, -1, 36));
        this.f51892a.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final x9 f50430b;

            {
                this.f50430b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i16, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i16 == 5) {
                            x9 x9Var = this.f50430b;
                            x9Var.f51893b.requestFocus();
                            w9 w9Var6 = x9Var.f51893b;
                            w9Var6.setSelection(w9Var6.length());
                            return true;
                        }
                        return false;
                    default:
                        if (i16 == 6) {
                            this.f50430b.f51894c.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        w9 w9Var6 = new w9(this, context, 1);
        this.f51893b = w9Var6;
        w9Var6.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.r6.E(this.f51893b, i11, e6Var);
        org.telegram.ui.ActionBar.r6.V(this.f51893b, i12, e6Var);
        this.f51893b.setBackgroundDrawable(null);
        org.telegram.ui.ActionBar.r6.G(this.f51893b, i13, i14, i15, e6Var);
        this.f51893b.setMaxLines(1);
        this.f51893b.setLines(1);
        this.f51893b.setSingleLine(true);
        w9 w9Var7 = this.f51893b;
        if (org.telegram.messenger.bd.f21784a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        w9Var7.setGravity(i10);
        this.f51893b.setInputType(49152);
        this.f51893b.setImeOptions(6);
        this.f51893b.setHint(org.telegram.messenger.bd.M0(2131749040, null));
        org.telegram.ui.ActionBar.r6.w(this.f51893b, i12, e6Var);
        this.f51893b.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        this.f51893b.setCursorWidth(1.5f);
        linearLayout.addView(this.f51893b, b8.mf.k(24.0f, 16.0f, 24.0f, 0.0f, -1, 36));
        this.f51893b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final x9 f50430b;

            {
                this.f50430b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i16, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i16 == 5) {
                            x9 x9Var = this.f50430b;
                            x9Var.f51893b.requestFocus();
                            w9 w9Var62 = x9Var.f51893b;
                            w9Var62.setSelection(w9Var62.length());
                            return true;
                        }
                        return false;
                    default:
                        if (i16 == 6) {
                            this.f50430b.f51894c.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        if (a22 != null) {
            this.f51892a.setText(a22.first_name);
            w9 w9Var8 = this.f51892a;
            w9Var8.setSelection(w9Var8.length());
            this.f51893b.setText(a22.last_name);
        }
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.ActionBar.e6 getResourceProvider() {
        return this.d;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        w9 w9Var = this.f51892a;
        int i3 = org.telegram.ui.ActionBar.k6.f28007k6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(w9Var, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        w9 w9Var2 = this.f51892a;
        int i10 = org.telegram.ui.ActionBar.k6.f28026l6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(w9Var2, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f51893b, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f51893b, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        return arrayList;
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (!org.telegram.messenger.hp.e1().getBoolean("view_animations", true)) {
            this.f51892a.requestFocus();
            org.telegram.messenger.g0.K3(this.f51892a);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            org.telegram.messenger.g0.i3(new xp0(this, 18), 100L);
        }
    }
}
