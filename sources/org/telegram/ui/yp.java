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
public final class yp extends f2.o0 {
    public final Context f40314c;
    public final zp d;

    public yp(zp zpVar, Context context) {
        this.d = zpVar;
        this.f40314c = context;
    }

    @Override
    public final int h() {
        zp zpVar = this.d;
        ArrayList arrayList = zpVar.f40847r;
        int i10 = 0;
        if (zpVar.D) {
            if (!zpVar.d.isEmpty()) {
                i10 = arrayList.size() + 1;
            }
            return i10 + 1;
        }
        if (!zpVar.d.isEmpty()) {
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
        View view = l1Var.f5774a;
        int j10 = j(i10);
        int i12 = 2;
        zp zpVar = this.d;
        if (j10 != 0) {
            if (j10 != 1) {
                if (j10 == 2) {
                    org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) view;
                    ArrayList arrayList = zpVar.f40847r;
                    if (!zpVar.D) {
                        i12 = 3;
                    }
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) arrayList.get(i10 - i12);
                    boolean contains = zpVar.d.contains(tL_availableReaction.reaction);
                    i11 = ((org.telegram.ui.ActionBar.p2) zpVar).currentAccount;
                    yVar.a(tL_availableReaction, contains, i11);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
            l4Var.setText(LocaleController.getString(R.string.OnlyAllowThisReactions));
            l4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false));
            return;
        }
        org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
        z8Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.B6, false));
        if (zpVar.D) {
            if (ChatObject.isChannelAndNotMegaGroup(zpVar.f40842a)) {
                string = LocaleController.getString(R.string.EnableReactionsChannelInfo);
            } else {
                string = LocaleController.getString(R.string.EnableReactionsGroupInfo);
            }
            z8Var.setText(string);
            return;
        }
        int i13 = zpVar.v;
        if (i13 == 1) {
            z8Var.setText(LocaleController.getString(R.string.EnableSomeReactionsInfo));
        } else if (i13 == 0) {
            z8Var.setText(LocaleController.getString(R.string.EnableAllReactionsInfo));
        } else if (i13 == 2) {
            z8Var.setText(LocaleController.getString(R.string.DisableReactionsInfo));
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        Context context = this.f40314c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    return new f2.l1(new org.telegram.ui.Cells.y(context, false, false));
                }
                FrameLayout frameLayout = new FrameLayout(context);
                zp zpVar = this.d;
                if (zpVar.f40848s.getParent() != null) {
                    ((ViewGroup) zpVar.f40848s.getParent()).removeView(zpVar.f40848s);
                }
                frameLayout.addView(zpVar.f40848s);
                frameLayout.setLayoutParams(new f2.w0(-1, -2));
                return new f2.l1(frameLayout);
            }
            return new f2.l1(new org.telegram.ui.Cells.l4(context, 23));
        }
        return new f2.l1(new org.telegram.ui.Cells.z8(context));
    }
}
