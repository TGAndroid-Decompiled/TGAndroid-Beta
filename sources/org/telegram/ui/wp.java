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
public final class wp extends f2.o0 {
    public final Context f39779c;
    public final xp d;

    public wp(xp xpVar, Context context) {
        this.d = xpVar;
        this.f39779c = context;
    }

    @Override
    public final int h() {
        xp xpVar = this.d;
        ArrayList arrayList = xpVar.f40281r;
        int i10 = 0;
        if (xpVar.D) {
            if (!xpVar.d.isEmpty()) {
                i10 = arrayList.size() + 1;
            }
            return i10 + 1;
        }
        if (!xpVar.d.isEmpty()) {
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
    public final void v(f2.l1 l1Var, int i10) {
        String string;
        int i11;
        View view = l1Var.f5785a;
        int j10 = j(i10);
        int i12 = 2;
        xp xpVar = this.d;
        if (j10 != 0) {
            if (j10 != 1) {
                if (j10 == 2) {
                    org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) view;
                    ArrayList arrayList = xpVar.f40281r;
                    if (!xpVar.D) {
                        i12 = 3;
                    }
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) arrayList.get(i10 - i12);
                    boolean contains = xpVar.d.contains(tL_availableReaction.reaction);
                    i11 = ((org.telegram.ui.ActionBar.p2) xpVar).currentAccount;
                    yVar.a(tL_availableReaction, contains, i11);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            m4Var.setText(LocaleController.getString(R.string.OnlyAllowThisReactions));
            m4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, false));
            return;
        }
        org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
        a9Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.B6, false));
        if (xpVar.D) {
            if (ChatObject.isChannelAndNotMegaGroup(xpVar.f40276a)) {
                string = LocaleController.getString(R.string.EnableReactionsChannelInfo);
            } else {
                string = LocaleController.getString(R.string.EnableReactionsGroupInfo);
            }
            a9Var.setText(string);
            return;
        }
        int i13 = xpVar.v;
        if (i13 == 1) {
            a9Var.setText(LocaleController.getString(R.string.EnableSomeReactionsInfo));
        } else if (i13 == 0) {
            a9Var.setText(LocaleController.getString(R.string.EnableAllReactionsInfo));
        } else if (i13 == 2) {
            a9Var.setText(LocaleController.getString(R.string.DisableReactionsInfo));
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        Context context = this.f39779c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    return new f2.l1(new org.telegram.ui.Cells.y(context, false, false));
                }
                FrameLayout frameLayout = new FrameLayout(context);
                xp xpVar = this.d;
                if (xpVar.f40282s.getParent() != null) {
                    ((ViewGroup) xpVar.f40282s.getParent()).removeView(xpVar.f40282s);
                }
                frameLayout.addView(xpVar.f40282s);
                frameLayout.setLayoutParams(new f2.w0(-1, -2));
                return new f2.l1(frameLayout);
            }
            return new f2.l1(new org.telegram.ui.Cells.m4(context, 23));
        }
        return new f2.l1(new org.telegram.ui.Cells.a9(context));
    }
}
