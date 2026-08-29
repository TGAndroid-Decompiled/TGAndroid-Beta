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
public final class qp extends f2.p0 {
    public final Context f41758c;
    public final rp d;

    public qp(rp rpVar, Context context) {
        this.d = rpVar;
        this.f41758c = context;
    }

    @Override
    public final int h() {
        rp rpVar = this.d;
        ArrayList arrayList = rpVar.f42176r;
        int i10 = 0;
        if (rpVar.C) {
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
        if (this.d.C) {
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
    public final void v(f2.n1 n1Var, int i10) {
        String string;
        int i11;
        View view = n1Var.f6432a;
        int j10 = j(i10);
        int i12 = 2;
        rp rpVar = this.d;
        if (j10 != 0) {
            if (j10 != 1) {
                if (j10 == 2) {
                    org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) view;
                    ArrayList arrayList = rpVar.f42176r;
                    if (!rpVar.C) {
                        i12 = 3;
                    }
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) arrayList.get(i10 - i12);
                    boolean contains = rpVar.d.contains(tL_availableReaction.reaction);
                    i11 = ((org.telegram.ui.ActionBar.o2) rpVar).currentAccount;
                    yVar.a(tL_availableReaction, contains, i11);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) view;
            k4Var.setText(LocaleController.getString(R.string.OnlyAllowThisReactions));
            k4Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
            return;
        }
        org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
        y8Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.B6, false));
        if (rpVar.C) {
            if (ChatObject.isChannelAndNotMegaGroup(rpVar.f42170a)) {
                string = LocaleController.getString(R.string.EnableReactionsChannelInfo);
            } else {
                string = LocaleController.getString(R.string.EnableReactionsGroupInfo);
            }
            y8Var.setText(string);
            return;
        }
        int i13 = rpVar.v;
        if (i13 == 1) {
            y8Var.setText(LocaleController.getString(R.string.EnableSomeReactionsInfo));
        } else if (i13 == 0) {
            y8Var.setText(LocaleController.getString(R.string.EnableAllReactionsInfo));
        } else if (i13 == 2) {
            y8Var.setText(LocaleController.getString(R.string.DisableReactionsInfo));
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        Context context = this.f41758c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    return new f2.n1(new org.telegram.ui.Cells.y(context, false, false));
                }
                FrameLayout frameLayout = new FrameLayout(context);
                rp rpVar = this.d;
                if (rpVar.f42177s.getParent() != null) {
                    ((ViewGroup) rpVar.f42177s.getParent()).removeView(rpVar.f42177s);
                }
                frameLayout.addView(rpVar.f42177s);
                frameLayout.setLayoutParams(new f2.x0(-1, -2));
                return new f2.n1(frameLayout);
            }
            return new f2.n1(new org.telegram.ui.Cells.k4(context, 23));
        }
        return new f2.n1(new org.telegram.ui.Cells.y8(context));
    }
}
