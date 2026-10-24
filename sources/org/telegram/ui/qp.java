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
public final class qp extends s4.g0 {
    public final Context f40912c;
    public final rp d;

    public qp(rp rpVar, Context context) {
        this.d = rpVar;
        this.f40912c = context;
    }

    @Override
    public final int h() {
        rp rpVar = this.d;
        ArrayList arrayList = rpVar.f41200r;
        int i10 = 0;
        if (rpVar.G) {
            if (!rpVar.d.isEmpty()) {
                i10 = arrayList.size() + 1;
            }
            return i10 + 1;
        }
        if (!rpVar.d.isEmpty()) {
            i10 = arrayList.size() + 1;
        }
        return i10 + 2;
    }

    @Override
    public final int j(int i10) {
        if (this.d.G) {
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
    public final void v(s4.b1 b1Var, int i10) {
        String string;
        int i11;
        View view = b1Var.f46342a;
        int j10 = j(i10);
        int i12 = 2;
        rp rpVar = this.d;
        if (j10 != 0) {
            if (j10 != 1) {
                if (j10 == 2) {
                    org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) view;
                    ArrayList arrayList = rpVar.f41200r;
                    if (!rpVar.G) {
                        i12 = 3;
                    }
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) arrayList.get(i10 - i12);
                    boolean contains = rpVar.d.contains(tL_availableReaction.reaction);
                    i11 = ((org.telegram.ui.ActionBar.o2) rpVar).currentAccount;
                    xVar.a(tL_availableReaction, contains, i11);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
            l4Var.setText(LocaleController.getString(R.string.OnlyAllowThisReactions));
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21184d6, l4Var, null);
            return;
        }
        org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
        org.telegram.ui.ActionBar.r6.W(e9Var.getTextView(), org.telegram.ui.ActionBar.k6.B6, null);
        if (rpVar.G) {
            if (ChatObject.isChannelAndNotMegaGroup(rpVar.f41195a)) {
                string = LocaleController.getString(R.string.EnableReactionsChannelInfo);
            } else {
                string = LocaleController.getString(R.string.EnableReactionsGroupInfo);
            }
            e9Var.setText(string);
            return;
        }
        int i13 = rpVar.v;
        if (i13 == 1) {
            e9Var.setText(LocaleController.getString(R.string.EnableSomeReactionsInfo));
        } else if (i13 == 0) {
            e9Var.setText(LocaleController.getString(R.string.EnableAllReactionsInfo));
        } else if (i13 == 2) {
            e9Var.setText(LocaleController.getString(R.string.DisableReactionsInfo));
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        Context context = this.f40912c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    return new s4.b1(new org.telegram.ui.Cells.x(context, false, false));
                }
                FrameLayout frameLayout = new FrameLayout(context);
                rp rpVar = this.d;
                if (rpVar.f41201s.getParent() != null) {
                    ((ViewGroup) rpVar.f41201s.getParent()).removeView(rpVar.f41201s);
                }
                frameLayout.addView(rpVar.f41201s);
                frameLayout.setLayoutParams(new s4.o0(-1, -2));
                return new s4.b1(frameLayout);
            }
            return new s4.b1(new org.telegram.ui.Cells.l4(context, 23));
        }
        return new s4.b1(new org.telegram.ui.Cells.e9(context));
    }
}
