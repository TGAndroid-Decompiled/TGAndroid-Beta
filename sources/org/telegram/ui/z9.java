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
public final class z9 extends org.telegram.ui.ActionBar.k2 {
    public y9 f44051a;
    public y9 f44052b;
    public org.telegram.ui.ActionBar.t0 f44053c;
    public org.telegram.ui.ActionBar.p6 d;

    public static void Y(z9 z9Var) {
        String str;
        TLRPC.User f7 = org.telegram.messenger.d20.i(z9Var.currentAccount).f();
        if (f7 != null && z9Var.f44052b.getText() != null && z9Var.f44051a.getText() != null) {
            String obj = z9Var.f44051a.getText().toString();
            String obj2 = z9Var.f44052b.getText().toString();
            String str2 = f7.first_name;
            if (str2 == null || !str2.equals(obj) || (str = f7.last_name) == null || !str.equals(obj2)) {
                TL_account.updateProfile updateprofile = new TL_account.updateProfile();
                updateprofile.flags = 3;
                updateprofile.first_name = obj;
                f7.first_name = obj;
                updateprofile.last_name = obj2;
                f7.last_name = obj2;
                TLRPC.User Z1 = org.telegram.messenger.vp.r1(z9Var.currentAccount).Z1(Long.valueOf(org.telegram.messenger.d20.i(z9Var.currentAccount).e()));
                if (Z1 != null) {
                    Z1.first_name = updateprofile.first_name;
                    Z1.last_name = updateprofile.last_name;
                }
                org.telegram.messenger.d20.i(z9Var.currentAccount).v(true);
                org.telegram.messenger.zs.f(z9Var.currentAccount).k(org.telegram.messenger.zs.f19632j0, new Object[0]);
                org.telegram.messenger.zs.f(z9Var.currentAccount).k(org.telegram.messenger.zs.f19676r, 1);
                ConnectionsManager.getInstance(z9Var.currentAccount).sendRequest(updateprofile, new ag.c3(4));
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21225t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21206s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20929d6));
    }

    @Override
    public final View createView(Context context) {
        int i10;
        int i11;
        org.telegram.ui.ActionBar.p6 p6Var = this.d;
        org.telegram.ui.ActionBar.a7.m(this.actionBar, 3, org.telegram.ui.ActionBar.t6.f20967f8, p6Var);
        org.telegram.ui.ActionBar.a7.m(this.actionBar, 1, org.telegram.ui.ActionBar.t6.f21261v8, p6Var);
        this.actionBar.setBackButtonImage(2131231241);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(org.telegram.messenger.cd.L0(2131751265, null));
        this.actionBar.setActionBarMenuOnItemClick(new ag.e(this, 20));
        this.f44053c = this.actionBar.p().h(1, 2131231243, org.telegram.messenger.cd.L0(2131751355, null), org.telegram.messenger.i0.L(56.0f));
        TLRPC.User Z1 = org.telegram.messenger.vp.r1(this.currentAccount).Z1(Long.valueOf(org.telegram.messenger.d20.i(this.currentAccount).e()));
        if (Z1 == null) {
            Z1 = org.telegram.messenger.d20.i(this.currentAccount).f();
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.fragmentView = linearLayout;
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ((LinearLayout) this.fragmentView).setOrientation(1);
        this.fragmentView.setOnTouchListener(new org.telegram.ui.ActionBar.n2(1));
        y9 y9Var = new y9(this, context, 0);
        this.f44051a = y9Var;
        y9Var.setTextSize(1, 18.0f);
        y9 y9Var2 = this.f44051a;
        int i12 = org.telegram.ui.ActionBar.t6.H6;
        org.telegram.ui.ActionBar.a7.E(y9Var2, i12, p6Var);
        y9 y9Var3 = this.f44051a;
        int i13 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.V(y9Var3, i13, p6Var);
        this.f44051a.setBackgroundDrawable(null);
        y9 y9Var4 = this.f44051a;
        int i14 = org.telegram.ui.ActionBar.t6.f21058k6;
        int i15 = org.telegram.ui.ActionBar.t6.f21076l6;
        int i16 = org.telegram.ui.ActionBar.t6.f21153p7;
        org.telegram.ui.ActionBar.a7.G(y9Var4, i14, i15, i16, p6Var);
        this.f44051a.setMaxLines(1);
        this.f44051a.setLines(1);
        this.f44051a.setSingleLine(true);
        y9 y9Var5 = this.f44051a;
        if (org.telegram.messenger.cd.X) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        y9Var5.setGravity(i10);
        this.f44051a.setInputType(49152);
        this.f44051a.setImeOptions(5);
        this.f44051a.setHint(org.telegram.messenger.cd.L0(2131750695, null));
        org.telegram.ui.ActionBar.a7.w(this.f44051a, i13, p6Var);
        this.f44051a.setCursorSize(org.telegram.messenger.i0.L(20.0f));
        this.f44051a.setCursorWidth(1.5f);
        linearLayout.addView(this.f44051a, w7.b6.k(24.0f, 24.0f, 24.0f, 0.0f, -1, 36));
        this.f44051a.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final z9 f43506b;

            {
                this.f43506b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i17, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i17 == 5) {
                            z9 z9Var = this.f43506b;
                            z9Var.f44052b.requestFocus();
                            y9 y9Var6 = z9Var.f44052b;
                            y9Var6.setSelection(y9Var6.length());
                            return true;
                        }
                        return false;
                    default:
                        if (i17 == 6) {
                            this.f43506b.f44053c.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        y9 y9Var6 = new y9(this, context, 1);
        this.f44052b = y9Var6;
        y9Var6.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.a7.E(this.f44052b, i12, p6Var);
        org.telegram.ui.ActionBar.a7.V(this.f44052b, i13, p6Var);
        this.f44052b.setBackgroundDrawable(null);
        org.telegram.ui.ActionBar.a7.G(this.f44052b, i14, i15, i16, p6Var);
        this.f44052b.setMaxLines(1);
        this.f44052b.setLines(1);
        this.f44052b.setSingleLine(true);
        y9 y9Var7 = this.f44052b;
        if (org.telegram.messenger.cd.X) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        y9Var7.setGravity(i11);
        this.f44052b.setInputType(49152);
        this.f44052b.setImeOptions(6);
        this.f44052b.setHint(org.telegram.messenger.cd.L0(2131749042, null));
        org.telegram.ui.ActionBar.a7.w(this.f44052b, i13, p6Var);
        this.f44052b.setCursorSize(org.telegram.messenger.i0.L(20.0f));
        this.f44052b.setCursorWidth(1.5f);
        linearLayout.addView(this.f44052b, w7.b6.k(24.0f, 16.0f, 24.0f, 0.0f, -1, 36));
        this.f44052b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final z9 f43506b;

            {
                this.f43506b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i17, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i17 == 5) {
                            z9 z9Var = this.f43506b;
                            z9Var.f44052b.requestFocus();
                            y9 y9Var62 = z9Var.f44052b;
                            y9Var62.setSelection(y9Var62.length());
                            return true;
                        }
                        return false;
                    default:
                        if (i17 == 6) {
                            this.f43506b.f44053c.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        if (Z1 != null) {
            this.f44051a.setText(Z1.first_name);
            y9 y9Var8 = this.f44051a;
            y9Var8.setSelection(y9Var8.length());
            this.f44052b.setText(Z1.last_name);
        }
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.ActionBar.p6 getResourceProvider() {
        return this.d;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        y9 y9Var = this.f44051a;
        int i10 = org.telegram.ui.ActionBar.t6.f21058k6;
        arrayList.add(new org.telegram.ui.ActionBar.c7(y9Var, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        y9 y9Var2 = this.f44051a;
        int i11 = org.telegram.ui.ActionBar.t6.f21076l6;
        arrayList.add(new org.telegram.ui.ActionBar.c7(y9Var2, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f44052b, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f44052b, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        return arrayList;
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (!org.telegram.messenger.vp.d1().getBoolean("view_animations", true)) {
            this.f44051a.requestFocus();
            org.telegram.messenger.i0.J3(this.f44051a);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            org.telegram.messenger.i0.h3(new rr0(this, 18), 100L);
        }
    }
}
