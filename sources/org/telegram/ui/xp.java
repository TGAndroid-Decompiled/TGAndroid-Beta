package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class xp extends f2.p0 {
    public final Context f43445c;
    public final yp d;

    public xp(yp ypVar, Context context) {
        this.d = ypVar;
        this.f43445c = context;
    }

    @Override
    public final int h() {
        yp ypVar = this.d;
        ArrayList arrayList = ypVar.f43680r;
        int i10 = 0;
        if (ypVar.D) {
            if (!ypVar.d.isEmpty()) {
                i10 = arrayList.size() + 1;
            }
            return i10 + 1;
        }
        if (!ypVar.d.isEmpty()) {
            i10 = arrayList.size() + 1;
        }
        return i10 + 2;
    }

    @Override
    public final int j(int i10) {
        if (this.d.D) {
            if (i10 == 0) {
                return 0;
            }
            if (i10 != 1) {
                return 2;
            }
            return 1;
        } else if (i10 == 0) {
            return 3;
        } else {
            if (i10 == 1) {
                return 0;
            }
            if (i10 != 2) {
                return 2;
            }
            return 1;
        }
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        String string;
        int i11;
        View view = m1Var.f5875a;
        int j10 = j(i10);
        int i12 = 2;
        yp ypVar = this.d;
        if (j10 != 0) {
            if (j10 != 1) {
                if (j10 == 2) {
                    org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) view;
                    ArrayList arrayList = ypVar.f43680r;
                    if (!ypVar.D) {
                        i12 = 3;
                    }
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) arrayList.get(i10 - i12);
                    boolean contains = ypVar.d.contains(tL_availableReaction.reaction);
                    i11 = ((org.telegram.ui.ActionBar.p2) ypVar).currentAccount;
                    yVar.a(tL_availableReaction, contains, i11);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            m4Var.setText(LocaleController.getString(R.string.OnlyAllowThisReactions));
            m4Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21659d6, false));
            return;
        }
        org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
        a9Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.B6, false));
        if (ypVar.D) {
            if (ChatObject.isChannelAndNotMegaGroup(ypVar.f43674a)) {
                string = LocaleController.getString(R.string.EnableReactionsChannelInfo);
            } else {
                string = LocaleController.getString(R.string.EnableReactionsGroupInfo);
            }
            a9Var.setText(string);
            return;
        }
        int i13 = ypVar.v;
        if (i13 == 1) {
            a9Var.setText(LocaleController.getString(R.string.EnableSomeReactionsInfo));
        } else if (i13 == 0) {
            a9Var.setText(LocaleController.getString(R.string.EnableAllReactionsInfo));
        } else if (i13 == 2) {
            a9Var.setText(LocaleController.getString(R.string.DisableReactionsInfo));
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        Context context = this.f43445c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    return new f2.m1(new org.telegram.ui.Cells.y(context, false, false));
                }
                FrameLayout frameLayout = new FrameLayout(context);
                yp ypVar = this.d;
                if (ypVar.f43681s.getParent() != null) {
                    ((ViewGroup) ypVar.f43681s.getParent()).removeView(ypVar.f43681s);
                }
                frameLayout.addView(ypVar.f43681s);
                frameLayout.setLayoutParams(new f2.x0(-1, -2));
                return new f2.m1(frameLayout);
            }
            return new f2.m1(new org.telegram.ui.Cells.m4(context, 23));
        }
        return new f2.m1(new org.telegram.ui.Cells.a9(context));
    }
}
