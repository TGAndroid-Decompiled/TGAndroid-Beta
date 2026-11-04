package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class z40 extends org.telegram.ui.Components.sj0 {
    public final Context f52527c;
    public final a50 d;

    public z40(a50 a50Var, Context context) {
        this.d = a50Var;
        this.f52527c = context;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        int b10 = d1Var.b();
        a50 a50Var = this.d;
        if (b10 != a50Var.f43608r && b10 != a50Var.f43607n && b10 != a50Var.f43609s && b10 != 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        a50 a50Var = this.d;
        if (a50Var.f43605e) {
            return 0;
        }
        return a50Var.f43611x;
    }

    @Override
    public final int d(int i3) {
        a50 a50Var = this.d;
        if (i3 != a50Var.f43607n && i3 != a50Var.f43609s && i3 != a50Var.f43608r) {
            if (i3 != a50Var.f43610w && i3 != a50Var.h) {
                if (i3 == 0) {
                    return 2;
                }
                return 0;
            }
            return 1;
        }
        return 0;
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        String str;
        int i10 = d1Var.f55544f;
        View view = d1Var.f55540a;
        a50 a50Var = this.d;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    org.telegram.ui.Cells.j8 j8Var = (org.telegram.ui.Cells.j8) view;
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = a50Var.f43606f;
                    if (tL_chatInviteExported != null) {
                        str = tL_chatInviteExported.link;
                    } else {
                        str = "error";
                    }
                    j8Var.f29457a.setText(str);
                    j8Var.setWillNotDraw(true);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
            if (i3 == a50Var.f43610w) {
                y8Var.setText("");
                return;
            } else if (i3 == a50Var.h) {
                TLRPC.Chat M0 = a50Var.getMessagesController().M0(Long.valueOf(a50Var.d));
                if (org.telegram.messenger.t3.T(M0) && !M0.megagroup) {
                    y8Var.setText(org.telegram.messenger.bd.M0(2131752386, null));
                    return;
                } else {
                    y8Var.setText(org.telegram.messenger.bd.M0(2131748919, null));
                    return;
                }
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.v9 v9Var = (org.telegram.ui.Cells.v9) view;
        if (i3 == a50Var.f43607n) {
            v9Var.b(org.telegram.messenger.bd.M0(2131751762, null), true);
        } else if (i3 == a50Var.f43609s) {
            v9Var.b(org.telegram.messenger.bd.M0(2131745468, null), false);
        } else if (i3 == a50Var.f43608r) {
            v9Var.b(org.telegram.messenger.bd.M0(2131746033, null), true);
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        FrameLayout frameLayout;
        int i10;
        Context context = this.f52527c;
        if (i3 != 0) {
            if (i3 != 1) {
                ?? frameLayout2 = new FrameLayout(context);
                TextView textView = new TextView(context);
                frameLayout2.f29457a = textView;
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, null);
                textView.setTextSize(1, 16.0f);
                int i11 = 3;
                if (org.telegram.messenger.bd.f21784a0) {
                    i10 = 5;
                } else {
                    i10 = 3;
                }
                textView.setGravity(i10 | 16);
                if (org.telegram.messenger.bd.f21784a0) {
                    i11 = 5;
                }
                frameLayout2.addView(textView, b8.mf.d(-1, -2.0f, i11 | 48, 23.0f, 10.0f, 23.0f, 10.0f));
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, frameLayout2, null);
                frameLayout = frameLayout2;
            } else {
                frameLayout = new org.telegram.ui.Cells.y8(context);
            }
        } else {
            FrameLayout v9Var = new org.telegram.ui.Cells.v9(context);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, v9Var, null);
            frameLayout = v9Var;
        }
        return new u4.d1(frameLayout);
    }
}
