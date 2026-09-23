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
public final class yp extends s4.h0 {
    public final Context f39864c;
    public final zp d;

    public yp(zp zpVar, Context context) {
        this.d = zpVar;
        this.f39864c = context;
    }

    @Override
    public final int h() {
        zp zpVar = this.d;
        ArrayList arrayList = zpVar.f40215r;
        int i10 = 0;
        if (zpVar.G) {
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
    public final void v(s4.c1 c1Var, int i10) {
        String string;
        int i11;
        View view = c1Var.f42627a;
        int j3 = j(i10);
        int i12 = 2;
        zp zpVar = this.d;
        if (j3 != 0) {
            if (j3 != 1) {
                if (j3 == 2) {
                    org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) view;
                    ArrayList arrayList = zpVar.f40215r;
                    if (!zpVar.G) {
                        i12 = 3;
                    }
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) arrayList.get(i10 - i12);
                    boolean contains = zpVar.d.contains(tL_availableReaction.reaction);
                    i11 = ((org.telegram.ui.ActionBar.n2) zpVar).currentAccount;
                    yVar.a(tL_availableReaction, contains, i11);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            m4Var.setText(LocaleController.getString(R.string.OnlyAllowThisReactions));
            m4Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18789d6, false));
            return;
        }
        org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view;
        f9Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.B6, false));
        if (zpVar.G) {
            if (ChatObject.isChannelAndNotMegaGroup(zpVar.f40210a)) {
                string = LocaleController.getString(R.string.EnableReactionsChannelInfo);
            } else {
                string = LocaleController.getString(R.string.EnableReactionsGroupInfo);
            }
            f9Var.setText(string);
            return;
        }
        int i13 = zpVar.v;
        if (i13 == 1) {
            f9Var.setText(LocaleController.getString(R.string.EnableSomeReactionsInfo));
        } else if (i13 == 0) {
            f9Var.setText(LocaleController.getString(R.string.EnableAllReactionsInfo));
        } else if (i13 == 2) {
            f9Var.setText(LocaleController.getString(R.string.DisableReactionsInfo));
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        Context context = this.f39864c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    return new s4.c1(new org.telegram.ui.Cells.y(context, false, false));
                }
                FrameLayout frameLayout = new FrameLayout(context);
                zp zpVar = this.d;
                if (zpVar.f40216s.getParent() != null) {
                    ((ViewGroup) zpVar.f40216s.getParent()).removeView(zpVar.f40216s);
                }
                frameLayout.addView(zpVar.f40216s);
                frameLayout.setLayoutParams(new s4.p0(-1, -2));
                return new s4.c1(frameLayout);
            }
            return new s4.c1(new org.telegram.ui.Cells.m4(context, 23));
        }
        return new s4.c1(new org.telegram.ui.Cells.f9(context));
    }
}
