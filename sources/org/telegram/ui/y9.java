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
public final class y9 extends org.telegram.ui.ActionBar.g2 {
    public x9 f54060a;
    public x9 f54061b;
    public org.telegram.ui.ActionBar.q0 f54062c;
    public org.telegram.ui.ActionBar.h6 d;

    public static void Z(y9 y9Var) {
        String str;
        TLRPC.User f10 = org.telegram.messenger.k10.i(y9Var.currentAccount).f();
        if (f10 != null && y9Var.f54061b.getText() != null && y9Var.f54060a.getText() != null) {
            String obj = y9Var.f54060a.getText().toString();
            String obj2 = y9Var.f54061b.getText().toString();
            String str2 = f10.first_name;
            if (str2 == null || !str2.equals(obj) || (str = f10.last_name) == null || !str.equals(obj2)) {
                TL_account.updateProfile updateprofile = new TL_account.updateProfile();
                updateprofile.flags = 3;
                updateprofile.first_name = obj;
                f10.first_name = obj;
                updateprofile.last_name = obj2;
                f10.last_name = obj2;
                TLRPC.User c22 = org.telegram.messenger.np.u1(y9Var.currentAccount).c2(Long.valueOf(org.telegram.messenger.k10.i(y9Var.currentAccount).e()));
                if (c22 != null) {
                    c22.first_name = updateprofile.first_name;
                    c22.last_name = updateprofile.last_name;
                }
                org.telegram.messenger.k10.i(y9Var.currentAccount).v(true);
                org.telegram.messenger.ls.f(y9Var.currentAccount).k(org.telegram.messenger.ls.f25292j0, new Object[0]);
                org.telegram.messenger.ls.f(y9Var.currentAccount).k(org.telegram.messenger.ls.f25335r, 1);
                ConnectionsManager.getInstance(y9Var.currentAccount).sendRequest(updateprofile, new fi.k5(9));
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29645t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29627s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29347d6));
    }

    @Override
    public final View createView(Context context) {
        int i7;
        int i10;
        org.telegram.ui.ActionBar.h6 h6Var = this.d;
        org.telegram.ui.ActionBar.t6.l(this.actionBar, 3, org.telegram.ui.ActionBar.m6.f29387f8, h6Var);
        org.telegram.ui.ActionBar.t6.l(this.actionBar, 1, org.telegram.ui.ActionBar.m6.f29684v8, h6Var);
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(org.telegram.messenger.hd.N0(2131751252, null));
        this.actionBar.setActionBarMenuOnItemClick(new x7(this, 3));
        this.f54062c = this.actionBar.s().h(1, 2131231242, org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.hd.N0(2131751342, null));
        TLRPC.User c22 = org.telegram.messenger.np.u1(this.currentAccount).c2(Long.valueOf(org.telegram.messenger.k10.i(this.currentAccount).e()));
        if (c22 == null) {
            c22 = org.telegram.messenger.k10.i(this.currentAccount).f();
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.fragmentView = linearLayout;
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ((LinearLayout) this.fragmentView).setOrientation(1);
        this.fragmentView.setOnTouchListener(new gi.a(2));
        x9 x9Var = new x9(this, context, 0);
        this.f54060a = x9Var;
        x9Var.setTextSize(1, 18.0f);
        x9 x9Var2 = this.f54060a;
        int i11 = org.telegram.ui.ActionBar.m6.H6;
        org.telegram.ui.ActionBar.t6.D(x9Var2, i11, h6Var);
        x9 x9Var3 = this.f54060a;
        int i12 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.U(x9Var3, i12, h6Var);
        this.f54060a.setBackgroundDrawable(null);
        x9 x9Var4 = this.f54060a;
        int i13 = org.telegram.ui.ActionBar.m6.f29476k6;
        int i14 = org.telegram.ui.ActionBar.m6.f29494l6;
        int i15 = org.telegram.ui.ActionBar.m6.f29568p7;
        org.telegram.ui.ActionBar.t6.F(x9Var4, i13, i14, i15, h6Var);
        this.f54060a.setMaxLines(1);
        this.f54060a.setLines(1);
        this.f54060a.setSingleLine(true);
        x9 x9Var5 = this.f54060a;
        if (org.telegram.messenger.hd.f24408a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        x9Var5.setGravity(i7);
        this.f54060a.setInputType(49152);
        this.f54060a.setImeOptions(5);
        this.f54060a.setHint(org.telegram.messenger.hd.N0(2131750677, null));
        org.telegram.ui.ActionBar.t6.v(this.f54060a, i12, h6Var);
        this.f54060a.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        this.f54060a.setCursorWidth(1.5f);
        linearLayout.addView(this.f54060a, c8.na.k(24.0f, 24.0f, 24.0f, 0.0f, -1, 36));
        this.f54060a.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final y9 f52998b;

            {
                this.f52998b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i16, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i16 == 5) {
                            y9 y9Var = this.f52998b;
                            y9Var.f54061b.requestFocus();
                            x9 x9Var6 = y9Var.f54061b;
                            x9Var6.setSelection(x9Var6.length());
                            return true;
                        }
                        return false;
                    default:
                        if (i16 == 6) {
                            this.f52998b.f54062c.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        x9 x9Var6 = new x9(this, context, 1);
        this.f54061b = x9Var6;
        x9Var6.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.t6.D(this.f54061b, i11, h6Var);
        org.telegram.ui.ActionBar.t6.U(this.f54061b, i12, h6Var);
        this.f54061b.setBackgroundDrawable(null);
        org.telegram.ui.ActionBar.t6.F(this.f54061b, i13, i14, i15, h6Var);
        this.f54061b.setMaxLines(1);
        this.f54061b.setLines(1);
        this.f54061b.setSingleLine(true);
        x9 x9Var7 = this.f54061b;
        if (org.telegram.messenger.hd.f24408a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        x9Var7.setGravity(i10);
        this.f54061b.setInputType(49152);
        this.f54061b.setImeOptions(6);
        this.f54061b.setHint(org.telegram.messenger.hd.N0(2131748839, null));
        org.telegram.ui.ActionBar.t6.v(this.f54061b, i12, h6Var);
        this.f54061b.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        this.f54061b.setCursorWidth(1.5f);
        linearLayout.addView(this.f54061b, c8.na.k(24.0f, 16.0f, 24.0f, 0.0f, -1, 36));
        this.f54061b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final y9 f52998b;

            {
                this.f52998b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i16, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i16 == 5) {
                            y9 y9Var = this.f52998b;
                            y9Var.f54061b.requestFocus();
                            x9 x9Var62 = y9Var.f54061b;
                            x9Var62.setSelection(x9Var62.length());
                            return true;
                        }
                        return false;
                    default:
                        if (i16 == 6) {
                            this.f52998b.f54062c.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        if (c22 != null) {
            this.f54060a.setText(c22.first_name);
            x9 x9Var8 = this.f54060a;
            x9Var8.setSelection(x9Var8.length());
            this.f54061b.setText(c22.last_name);
        }
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.ActionBar.h6 getResourceProvider() {
        return this.d;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        x9 x9Var = this.f54060a;
        int i7 = org.telegram.ui.ActionBar.m6.f29476k6;
        arrayList.add(new org.telegram.ui.ActionBar.v6(x9Var, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        x9 x9Var2 = this.f54060a;
        int i10 = org.telegram.ui.ActionBar.m6.f29494l6;
        arrayList.add(new org.telegram.ui.ActionBar.v6(x9Var2, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f54061b, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f54061b, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        return arrayList;
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (!org.telegram.messenger.np.g1().getBoolean("view_animations", true)) {
            this.f54060a.requestFocus();
            org.telegram.messenger.g0.I3(this.f54060a);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            org.telegram.messenger.g0.h3(new iq0(this, 18), 100L);
        }
    }
}
