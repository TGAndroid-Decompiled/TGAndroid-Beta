package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class so extends org.telegram.ui.Components.bk0 {
    public final Context f52039c;
    public final vo d;

    public so(vo voVar, Context context) {
        this.d = voVar;
        this.f52039c = context;
    }

    @Override
    public final void A(v4.f1 f1Var) {
        View view = f1Var.f59122a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f59126f;
        if (i7 != 0 && i7 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        vo voVar = this.d;
        if (voVar.f52832x && !voVar.f52833y) {
            return 0;
        }
        return voVar.N;
    }

    @Override
    public final int d(int i7) {
        vo voVar = this.d;
        voVar.getClass();
        if (i7 == 0) {
            return 3;
        }
        if (i7 != voVar.G && i7 != voVar.J) {
            if (i7 >= voVar.H && i7 < voVar.I) {
                return 0;
            }
            if (i7 == voVar.L) {
                return 4;
            }
            return 1;
        }
        return 2;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        String k10;
        vo voVar = this.d;
        boolean z10 = voVar.f52830s;
        int i10 = f1Var.f59126f;
        View view = f1Var.f59122a;
        boolean z11 = false;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    org.telegram.ui.Cells.x4 x4Var = (org.telegram.ui.Cells.x4) view;
                    if (z10) {
                        if (voVar.h.linked_chat_id != 0) {
                            int i11 = org.telegram.ui.ActionBar.n6.f29617p7;
                            x4Var.a(i11, i11);
                            x4Var.b(2131232330, 5, org.telegram.messenger.gd.M0(2131751360, null), false);
                            return;
                        }
                        x4Var.a(org.telegram.ui.ActionBar.n6.f29731v6, org.telegram.ui.ActionBar.n6.f29712u6);
                        x4Var.b(2131232177, 5, org.telegram.messenger.gd.M0(2131751374, null), true);
                        return;
                    }
                    int i12 = org.telegram.ui.ActionBar.n6.f29617p7;
                    x4Var.a(i12, i12);
                    x4Var.b(2131232330, 5, org.telegram.messenger.gd.M0(2131751362, null), false);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
            if (i7 == voVar.M) {
                z8Var.setText(org.telegram.messenger.gd.M0(2131752292, null));
                return;
            } else if (i7 == voVar.K) {
                if (z10) {
                    z8Var.setText(org.telegram.messenger.gd.M0(2131751376, null));
                    return;
                } else {
                    z8Var.setText(org.telegram.messenger.gd.M0(2131751372, null));
                    return;
                }
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
        a5Var.setTag(Integer.valueOf(i7));
        TLRPC.Chat chat = (TLRPC.Chat) voVar.f52831w.get(i7 - voVar.H);
        String K = org.telegram.messenger.v3.K(chat, false);
        if (TextUtils.isEmpty(K)) {
            k10 = null;
        } else {
            k10 = p5.c.k("@", K);
        }
        if (i7 != voVar.I - 1 || voVar.h.linked_chat_id != 0) {
            z11 = true;
        }
        a5Var.c(chat, null, k10, z11);
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        FrameLayout a5Var;
        TLRPC.Chat chat;
        vo voVar = this.d;
        boolean z10 = voVar.f52830s;
        if (i7 != 0) {
            Context context = this.f52039c;
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 4) {
                        FrameLayout frameLayout = new FrameLayout(context);
                        ?? linearLayout = new LinearLayout(context);
                        linearLayout.f50642c = org.telegram.messenger.j10.f24773t0;
                        linearLayout.setPadding(0, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f));
                        linearLayout.setOrientation(1);
                        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
                        linearLayout.f50640a = q9Var;
                        org.telegram.ui.Components.q80 q80Var = new org.telegram.ui.Components.q80(q9Var, "M476.1,397.4c25.8-47.2,0.3-105.9-50.9-120c-2.5-6.9-7.8-12.7-15-16.4l0.4-229.4c0-12.3-10-22.4-22.4-22.4H128.5c-12.3,0-22.4,10-22.4,22.4l-0.4,229.8v0c0,6.7,2.9,12.6,7.6,16.7c-51.6,15.9-79.2,77.2-48.1,116.4c-8.7,11.7-13.4,27.5-14,47.2c-1.7,34.5,21.6,45.8,55.9,45.8c52.3,0,99.1,4.6,105.1-36.2c16.5,0.9,7.1-37.3-6.5-53.3c18.4-22.4,18.3-52.9,4.9-78.2c-0.7-5.3-3.8-9.8-8.1-12.6c-1.5-2-1.6-2-2.1-2.7c0.2-1,1.2-11.8-3.4-20.9h138.5c-4.8,8.8-4.7,17-2.9,22.1c-5.3,4.8-6.8,12.3-5.2,17c-11.4,24.9-10,53.8,4.3,77.5c-6.8,9.7-11.2,21.7-12.6,31.6c-0.2-0.2-0.4-0.3-0.6-0.5c0.8-3.3,0.4-6.4-1.3-7.8c9.3-12.1-4.5-29.2-17-21.7c-3.8-2.8-10.6-3.2-18.1-0.5c-2.4-10.6-21.1-10.6-28.6-1c-1.3,0.3-2.9,0.8-4.5,1.9c-5.2-0.9-10.9,0.1-14.1,4.4c-6.9,3-9.5,10.4-7.8,17c-0.9,1.8-1.1,4-0.8,6.3c-1.6,1.2-2.3,3.1-2,4.9c0.1,0.6,10.4,56.6,11.2,62c0.3,1.8,1.5,3.2,3.1,3.9c8.7,3.4,12,3.8,30.1,9.4c2.7,0.8,2.4,0.8,6.7-0.1c16.4-3.5,30.2-8.9,30.8-9.2c1.6-0.6,2.7-2,3.1-3.7c0.1-0.4,6.8-36.5,10-53.2c0.9,4.2,3.3,7.3,7.4,7.5c1.2,7.8,4.4,14.5,9.5,19.9c16.4,17.3,44.9,15.7,64.9,16.1c38.3,0.8,74.5,1.5,84.4-24.4C488.9,453.5,491.3,421.3,476.1,397.4z", org.telegram.messenger.g0.L(104.0f), org.telegram.messenger.g0.L(104.0f));
                        linearLayout.f50641b = q80Var;
                        q9Var.setImageDrawable(q80Var);
                        linearLayout.addView(q9Var, c8.ma.t(104, 104, 49, 0, 2, 0, 0));
                        frameLayout.addView((View) linearLayout, c8.ma.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                        TextView textView = new TextView(context);
                        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29454g9, null);
                        textView.setTextSize(1, 14.0f);
                        textView.setGravity(17);
                        if (z10) {
                            TLRPC.ChatFull chatFull = voVar.h;
                            if (chatFull != null && chatFull.linked_chat_id != 0) {
                                TLRPC.Chat O0 = voVar.getMessagesController().O0(Long.valueOf(voVar.h.linked_chat_id));
                                if (O0 != null) {
                                    org.telegram.messenger.f3.q("DiscussionChannelGroupSetHelp2", null, 2131751377, new Object[]{O0.title}, textView);
                                }
                            } else {
                                textView.setText(org.telegram.messenger.gd.M0(2131751375, null));
                            }
                        } else {
                            TLRPC.Chat O02 = voVar.getMessagesController().O0(Long.valueOf(voVar.h.linked_chat_id));
                            if (O02 != null) {
                                org.telegram.messenger.f3.q("DiscussionGroupHelp", null, 2131751373, new Object[]{O02.title}, textView);
                            }
                        }
                        frameLayout.addView(textView, c8.ma.d(-1, -2.0f, 51, 52.0f, 143.0f, 52.0f, 18.0f));
                        frameLayout.setTag(-33024);
                        a5Var = frameLayout;
                    } else {
                        if (z10) {
                            chat = (TLRPC.Chat) voVar.f52831w.get(0);
                        } else {
                            chat = voVar.f52827f;
                        }
                        ro roVar = new ro(this, context, chat, chat);
                        voVar.E = roVar;
                        a5Var = roVar;
                    }
                } else {
                    a5Var = new org.telegram.ui.Cells.x4(context);
                }
            } else {
                a5Var = new org.telegram.ui.Cells.z8(context);
            }
        } else {
            a5Var = new org.telegram.ui.Cells.a5(this.f52039c, 6, 2, false, null);
        }
        return new v4.f1(a5Var);
    }
}
