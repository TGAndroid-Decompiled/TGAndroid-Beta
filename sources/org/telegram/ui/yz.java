package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
public final class yz extends org.telegram.ui.Components.rl0 {
    public final zz f43740c;

    public yz(zz zzVar) {
        this.f43740c = zzVar;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        if (m1Var.f5879f == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f43740c.E;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        zz zzVar = this.f43740c;
        if (i10 != zzVar.L && i10 != zzVar.H) {
            if (i10 == zzVar.F) {
                return 3;
            }
            if (i10 >= zzVar.J && i10 < zzVar.K) {
                return 4;
            }
            if (i10 != zzVar.I && i10 != zzVar.G) {
                return 0;
            }
            return 5;
        }
        return 2;
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        String str;
        String str2;
        TLRPC.Chat chat;
        String str3;
        float f10;
        int i11;
        zz zzVar = this.f43740c;
        ArrayList arrayList = zzVar.f44052f;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = zzVar.d;
        int i12 = m1Var.f5879f;
        View view = m1Var.f5875a;
        if (i12 == 0) {
            zzVar.N = (pz) view;
            zzVar.g0();
        } else if (i12 == 2) {
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
            Activity parentActivity = zzVar.getParentActivity();
            if (i10 == zzVar.L) {
                i11 = R.drawable.greydivider_bottom;
            } else {
                i11 = R.drawable.greydivider;
            }
            a9Var.setBackground(org.telegram.ui.ActionBar.k6.V0(parentActivity, i11, org.telegram.ui.ActionBar.k6.f21626b7));
            if (i10 == zzVar.L) {
                a9Var.setFixedSize(0);
                if (tL_exportedChatlistInvite != null && !arrayList.isEmpty()) {
                    a9Var.setText(LocaleController.getString(R.string.FilterInviteHint));
                    return;
                } else {
                    a9Var.setText(LocaleController.getString(R.string.FilterInviteHintNo));
                    return;
                }
            }
            a9Var.setFixedSize(12);
        } else {
            int i13 = 1;
            String str4 = null;
            if (i12 == 3) {
                sz szVar = (sz) view;
                if (tL_exportedChatlistInvite == null) {
                    str3 = null;
                } else {
                    str3 = tL_exportedChatlistInvite.url;
                }
                hg.q qVar = szVar.h;
                org.telegram.ui.ActionBar.l5 l5Var = szVar.f41334c;
                TextView textView = szVar.f41337n;
                ImageView imageView = szVar.d;
                hg.q qVar2 = szVar.f41336f;
                szVar.f41339s = str3;
                if (str3 != null) {
                    if (str3.startsWith("http://")) {
                        str3 = str3.substring(7);
                    }
                    if (str3.startsWith("https://")) {
                        str3 = str3.substring(8);
                    }
                }
                l5Var.l(str3, false);
                float f11 = szVar.v;
                if (str3 == null) {
                    i13 = 0;
                }
                if (f11 != i13) {
                    ValueAnimator valueAnimator = szVar.f41340w;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        szVar.f41340w = null;
                    }
                    if (str3 != null) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    szVar.v = f10;
                    rz rzVar = szVar.f41335e;
                    rzVar.f40965b = f10;
                    rzVar.invalidate();
                    qVar2.setAlpha(szVar.v);
                    szVar.h.setAlpha(szVar.v);
                    imageView.setAlpha(szVar.v);
                    textView.setAlpha(1.0f - szVar.v);
                    l5Var.setAlpha(szVar.v);
                    szVar.f41333b.setAlpha(1.0f - szVar.v);
                    if (str3 == null) {
                        textView.setVisibility(0);
                        imageView.setVisibility(8);
                        qVar2.setVisibility(8);
                        qVar.setVisibility(8);
                        return;
                    }
                    textView.setVisibility(8);
                    imageView.setVisibility(0);
                    qVar2.setVisibility(0);
                    qVar.setVisibility(0);
                }
            } else if (i12 == 4) {
                org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
                Long l10 = (Long) zzVar.h.get(i10 - zzVar.J);
                long longValue = l10.longValue();
                if (longValue >= 0) {
                    TLRPC.User user = zzVar.getMessagesController().getUser(l10);
                    if (user != null) {
                        str2 = UserObject.getUserName(user);
                        chat = user;
                    } else {
                        str2 = null;
                        chat = user;
                    }
                } else {
                    TLRPC.Chat chat2 = zzVar.getMessagesController().getChat(Long.valueOf(-longValue));
                    if (chat2 != null) {
                        str4 = chat2.title;
                        if (chat2.participants_count != 0) {
                            if (ChatObject.isChannelAndNotMegaGroup(chat2)) {
                                str = LocaleController.formatPluralStringComma("Subscribers", chat2.participants_count);
                            } else {
                                str = LocaleController.formatPluralStringComma("Members", chat2.participants_count);
                            }
                        } else if (ChatObject.isChannelAndNotMegaGroup(chat2)) {
                            str = LocaleController.getString("ChannelPublic");
                        } else {
                            str = LocaleController.getString("MegaPublic");
                        }
                    } else {
                        str = null;
                    }
                    String str5 = str4;
                    str4 = str;
                    str2 = str5;
                    chat = chat2;
                }
                if (arrayList.contains(l10)) {
                    g4Var.setForbiddenCheck(false);
                    g4Var.c(zzVar.f44051e.contains(l10), false);
                } else {
                    g4Var.setForbiddenCheck(true);
                    g4Var.c(false, false);
                    if (chat instanceof TLRPC.User) {
                        if (((TLRPC.User) chat).bot) {
                            str4 = LocaleController.getString(R.string.FilterInviteBot);
                        } else {
                            str4 = LocaleController.getString(R.string.FilterInviteUser);
                        }
                    } else if (chat instanceof TLRPC.Chat) {
                        if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                            str4 = LocaleController.getString(R.string.FilterInviteChannel);
                        } else {
                            str4 = LocaleController.getString(R.string.FilterInviteGroup);
                        }
                    }
                }
                g4Var.setTag(l10);
                g4Var.d(chat, str2, str4);
            } else if (i12 == 5) {
                org.telegram.ui.Components.a10 a10Var = (org.telegram.ui.Components.a10) view;
                if (a10Var == zzVar.M) {
                    zzVar.M = null;
                }
                if (i10 == zzVar.G) {
                    a10Var.b(LocaleController.getString(R.string.InviteLink), false);
                    a10Var.a("", null);
                    return;
                }
                zzVar.M = a10Var;
                if (tL_exportedChatlistInvite != null && !arrayList.isEmpty()) {
                    zzVar.f0(false);
                    return;
                }
                a10Var.b(LocaleController.getString(R.string.FilterInviteHeaderChatsNo), false);
                a10Var.a("", null);
            }
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View a10Var;
        View view;
        zz zzVar = this.f43740c;
        View view2 = null;
        if (i10 == 0) {
            Activity parentActivity = zzVar.getParentActivity();
            int i11 = R.raw.folder_share;
            ?? frameLayout = new FrameLayout(parentActivity);
            ?? imageView = new ImageView(parentActivity);
            imageView.f(i11, 90, 90, null);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.d();
            imageView.setImportantForAccessibility(2);
            frameLayout.addView(imageView, k7.c6.d(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
            jh.s sVar = new jh.s(parentActivity);
            frameLayout.f40281a = sVar;
            sVar.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.B6, false));
            sVar.setTextSize(1, 14.0f);
            sVar.setGravity(17);
            sVar.setLines(2);
            frameLayout.addView(sVar, k7.c6.d(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
            view = frameLayout;
        } else {
            if (i10 == 2) {
                view2 = new org.telegram.ui.Cells.a9(zzVar.getParentActivity());
            } else {
                if (i10 == 3) {
                    a10Var = new xz(this, zzVar.getParentActivity(), zzVar);
                    a10Var.setLayoutParams(new f2.x0(-1, -2));
                    a10Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21661d6, false));
                } else if (i10 == 4) {
                    View g4Var = new org.telegram.ui.Cells.g4(zzVar.getParentActivity(), 1, 0, false);
                    g4Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21661d6, false));
                    view = g4Var;
                } else if (i10 == 5) {
                    a10Var = new org.telegram.ui.Components.a10(zzVar.getParentActivity());
                    a10Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21661d6, false));
                }
                view2 = a10Var;
            }
            return new f2.m1(view2);
        }
        view2 = view;
        return new f2.m1(view2);
    }
}
