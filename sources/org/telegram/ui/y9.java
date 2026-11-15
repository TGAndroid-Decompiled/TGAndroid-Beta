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
public final class y9 extends org.telegram.ui.ActionBar.e2 {
    public x9 f53474a;
    public x9 f53475b;
    public org.telegram.ui.ActionBar.q0 f53476c;
    public org.telegram.ui.ActionBar.e6 d;

    public static void Z(y9 y9Var) {
        String str;
        TLRPC.User f10 = org.telegram.messenger.m10.i(y9Var.currentAccount).f();
        if (f10 != null && y9Var.f53475b.getText() != null && y9Var.f53474a.getText() != null) {
            String obj = y9Var.f53474a.getText().toString();
            String obj2 = y9Var.f53475b.getText().toString();
            String str2 = f10.first_name;
            if (str2 == null || !str2.equals(obj) || (str = f10.last_name) == null || !str.equals(obj2)) {
                TL_account.updateProfile updateprofile = new TL_account.updateProfile();
                updateprofile.flags = 3;
                updateprofile.first_name = obj;
                f10.first_name = obj;
                updateprofile.last_name = obj2;
                f10.last_name = obj2;
                TLRPC.User a22 = org.telegram.messenger.np.s1(y9Var.currentAccount).a2(Long.valueOf(org.telegram.messenger.m10.i(y9Var.currentAccount).e()));
                if (a22 != null) {
                    a22.first_name = updateprofile.first_name;
                    a22.last_name = updateprofile.last_name;
                }
                org.telegram.messenger.m10.i(y9Var.currentAccount).v(true);
                org.telegram.messenger.ns.f(y9Var.currentAccount).k(org.telegram.messenger.ns.f25516j0, new Object[0]);
                org.telegram.messenger.ns.f(y9Var.currentAccount).k(org.telegram.messenger.ns.f25559r, 1);
                ConnectionsManager.getInstance(y9Var.currentAccount).sendRequest(updateprofile, new fi.m5(9));
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29147t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29129s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28849d6));
    }

    @Override
    public final View createView(Context context) {
        int i7;
        int i10;
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        org.telegram.ui.ActionBar.q6.l(this.actionBar, 3, org.telegram.ui.ActionBar.j6.f28889f8, e6Var);
        org.telegram.ui.ActionBar.q6.l(this.actionBar, 1, org.telegram.ui.ActionBar.j6.f29186v8, e6Var);
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131751264, null));
        this.actionBar.setActionBarMenuOnItemClick(new p9(this, 1));
        this.f53476c = this.actionBar.s().h(1, 2131231242, org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.hd.M0(2131751354, null));
        TLRPC.User a22 = org.telegram.messenger.np.s1(this.currentAccount).a2(Long.valueOf(org.telegram.messenger.m10.i(this.currentAccount).e()));
        if (a22 == null) {
            a22 = org.telegram.messenger.m10.i(this.currentAccount).f();
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.fragmentView = linearLayout;
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ((LinearLayout) this.fragmentView).setOrientation(1);
        this.fragmentView.setOnTouchListener(new gi.a(2));
        x9 x9Var = new x9(this, context, 0);
        this.f53474a = x9Var;
        x9Var.setTextSize(1, 18.0f);
        x9 x9Var2 = this.f53474a;
        int i11 = org.telegram.ui.ActionBar.j6.H6;
        org.telegram.ui.ActionBar.q6.D(x9Var2, i11, e6Var);
        x9 x9Var3 = this.f53474a;
        int i12 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.q6.U(x9Var3, i12, e6Var);
        this.f53474a.setBackgroundDrawable(null);
        x9 x9Var4 = this.f53474a;
        int i13 = org.telegram.ui.ActionBar.j6.f28978k6;
        int i14 = org.telegram.ui.ActionBar.j6.f28996l6;
        int i15 = org.telegram.ui.ActionBar.j6.f29070p7;
        org.telegram.ui.ActionBar.q6.F(x9Var4, i13, i14, i15, e6Var);
        this.f53474a.setMaxLines(1);
        this.f53474a.setLines(1);
        this.f53474a.setSingleLine(true);
        x9 x9Var5 = this.f53474a;
        if (org.telegram.messenger.hd.f24101a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        x9Var5.setGravity(i7);
        this.f53474a.setInputType(49152);
        this.f53474a.setImeOptions(5);
        this.f53474a.setHint(org.telegram.messenger.hd.M0(2131750694, null));
        org.telegram.ui.ActionBar.q6.v(this.f53474a, i12, e6Var);
        this.f53474a.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        this.f53474a.setCursorWidth(1.5f);
        linearLayout.addView(this.f53474a, c8.ja.k(24.0f, 24.0f, 24.0f, 0.0f, -1, 36));
        this.f53474a.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final y9 f52502b;

            {
                this.f52502b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i16, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i16 == 5) {
                            y9 y9Var = this.f52502b;
                            y9Var.f53475b.requestFocus();
                            x9 x9Var6 = y9Var.f53475b;
                            x9Var6.setSelection(x9Var6.length());
                            return true;
                        }
                        return false;
                    default:
                        if (i16 == 6) {
                            this.f52502b.f53476c.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        x9 x9Var6 = new x9(this, context, 1);
        this.f53475b = x9Var6;
        x9Var6.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.q6.D(this.f53475b, i11, e6Var);
        org.telegram.ui.ActionBar.q6.U(this.f53475b, i12, e6Var);
        this.f53475b.setBackgroundDrawable(null);
        org.telegram.ui.ActionBar.q6.F(this.f53475b, i13, i14, i15, e6Var);
        this.f53475b.setMaxLines(1);
        this.f53475b.setLines(1);
        this.f53475b.setSingleLine(true);
        x9 x9Var7 = this.f53475b;
        if (org.telegram.messenger.hd.f24101a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        x9Var7.setGravity(i10);
        this.f53475b.setInputType(49152);
        this.f53475b.setImeOptions(6);
        this.f53475b.setHint(org.telegram.messenger.hd.M0(2131749032, null));
        org.telegram.ui.ActionBar.q6.v(this.f53475b, i12, e6Var);
        this.f53475b.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        this.f53475b.setCursorWidth(1.5f);
        linearLayout.addView(this.f53475b, c8.ja.k(24.0f, 16.0f, 24.0f, 0.0f, -1, 36));
        this.f53475b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final y9 f52502b;

            {
                this.f52502b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i16, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i16 == 5) {
                            y9 y9Var = this.f52502b;
                            y9Var.f53475b.requestFocus();
                            x9 x9Var62 = y9Var.f53475b;
                            x9Var62.setSelection(x9Var62.length());
                            return true;
                        }
                        return false;
                    default:
                        if (i16 == 6) {
                            this.f52502b.f53476c.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        if (a22 != null) {
            this.f53474a.setText(a22.first_name);
            x9 x9Var8 = this.f53474a;
            x9Var8.setSelection(x9Var8.length());
            this.f53475b.setText(a22.last_name);
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
        x9 x9Var = this.f53474a;
        int i7 = org.telegram.ui.ActionBar.j6.f28978k6;
        arrayList.add(new org.telegram.ui.ActionBar.s6(x9Var, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        x9 x9Var2 = this.f53474a;
        int i10 = org.telegram.ui.ActionBar.j6.f28996l6;
        arrayList.add(new org.telegram.ui.ActionBar.s6(x9Var2, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f53475b, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f53475b, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i10));
        return arrayList;
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (!org.telegram.messenger.np.e1().getBoolean("view_animations", true)) {
            this.f53474a.requestFocus();
            org.telegram.messenger.g0.J3(this.f53474a);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            org.telegram.messenger.g0.i3(new fq0(this, 18), 100L);
        }
    }
}
