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
public final class xz extends org.telegram.ui.Components.rl0 {
    public final yz f40337c;

    public xz(yz yzVar) {
        this.f40337c = yzVar;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        if (l1Var.f5788f == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f40337c.E;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        yz yzVar = this.f40337c;
        if (i10 != yzVar.L && i10 != yzVar.H) {
            if (i10 == yzVar.F) {
                return 3;
            }
            if (i10 >= yzVar.J && i10 < yzVar.K) {
                return 4;
            }
            if (i10 != yzVar.I && i10 != yzVar.G) {
                return 0;
            }
            return 5;
        }
        return 2;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        String str;
        String str2;
        TLRPC.Chat chat;
        String str3;
        float f10;
        int i11;
        yz yzVar = this.f40337c;
        ArrayList arrayList = yzVar.f40606f;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = yzVar.d;
        int i12 = l1Var.f5788f;
        View view = l1Var.f5785a;
        if (i12 == 0) {
            yzVar.N = (oz) view;
            yzVar.g0();
        } else if (i12 == 2) {
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
            Activity parentActivity = yzVar.getParentActivity();
            if (i10 == yzVar.L) {
                i11 = R.drawable.greydivider_bottom;
            } else {
                i11 = R.drawable.greydivider;
            }
            a9Var.setBackground(org.telegram.ui.ActionBar.j6.V0(parentActivity, i11, org.telegram.ui.ActionBar.j6.f19871b7));
            if (i10 == yzVar.L) {
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
                rz rzVar = (rz) view;
                if (tL_exportedChatlistInvite == null) {
                    str3 = null;
                } else {
                    str3 = tL_exportedChatlistInvite.url;
                }
                gg.q qVar = rzVar.h;
                org.telegram.ui.ActionBar.k5 k5Var = rzVar.f38144c;
                TextView textView = rzVar.f38146n;
                ImageView imageView = rzVar.d;
                gg.q qVar2 = rzVar.f38145f;
                rzVar.f38148s = str3;
                if (str3 != null) {
                    if (str3.startsWith("http://")) {
                        str3 = str3.substring(7);
                    }
                    if (str3.startsWith("https://")) {
                        str3 = str3.substring(8);
                    }
                }
                k5Var.l(str3, false);
                float f11 = rzVar.v;
                if (str3 == null) {
                    i13 = 0;
                }
                if (f11 != i13) {
                    ValueAnimator valueAnimator = rzVar.f38149w;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        rzVar.f38149w = null;
                    }
                    if (str3 != null) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    rzVar.v = f10;
                    qz qzVar = rzVar.e;
                    qzVar.f37873b = f10;
                    qzVar.invalidate();
                    qVar2.setAlpha(rzVar.v);
                    rzVar.h.setAlpha(rzVar.v);
                    imageView.setAlpha(rzVar.v);
                    textView.setAlpha(1.0f - rzVar.v);
                    k5Var.setAlpha(rzVar.v);
                    rzVar.f38143b.setAlpha(1.0f - rzVar.v);
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
                Long l10 = (Long) yzVar.h.get(i10 - yzVar.J);
                long longValue = l10.longValue();
                if (longValue >= 0) {
                    TLRPC.User user = yzVar.getMessagesController().getUser(l10);
                    if (user != null) {
                        str2 = UserObject.getUserName(user);
                        chat = user;
                    } else {
                        str2 = null;
                        chat = user;
                    }
                } else {
                    TLRPC.Chat chat2 = yzVar.getMessagesController().getChat(Long.valueOf(-longValue));
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
                    g4Var.c(yzVar.e.contains(l10), false);
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
                org.telegram.ui.Components.z00 z00Var = (org.telegram.ui.Components.z00) view;
                if (z00Var == yzVar.M) {
                    yzVar.M = null;
                }
                if (i10 == yzVar.G) {
                    z00Var.b(LocaleController.getString(R.string.InviteLink), false);
                    z00Var.a("", null);
                    return;
                }
                yzVar.M = z00Var;
                if (tL_exportedChatlistInvite != null && !arrayList.isEmpty()) {
                    yzVar.f0(false);
                    return;
                }
                z00Var.b(LocaleController.getString(R.string.FilterInviteHeaderChatsNo), false);
                z00Var.a("", null);
            }
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View z00Var;
        View view;
        yz yzVar = this.f40337c;
        View view2 = null;
        if (i10 == 0) {
            Activity parentActivity = yzVar.getParentActivity();
            int i11 = R.raw.folder_share;
            ?? frameLayout = new FrameLayout(parentActivity);
            ?? imageView = new ImageView(parentActivity);
            imageView.f(i11, 90, 90, null);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.d();
            imageView.setImportantForAccessibility(2);
            frameLayout.addView(imageView, k7.b6.d(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
            ih.s sVar = new ih.s(parentActivity);
            frameLayout.f37133a = sVar;
            sVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.B6, false));
            sVar.setTextSize(1, 14.0f);
            sVar.setGravity(17);
            sVar.setLines(2);
            frameLayout.addView(sVar, k7.b6.d(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
            view = frameLayout;
        } else {
            if (i10 == 2) {
                view2 = new org.telegram.ui.Cells.a9(yzVar.getParentActivity());
            } else {
                if (i10 == 3) {
                    z00Var = new wz(this, yzVar.getParentActivity(), yzVar);
                    z00Var.setLayoutParams(new f2.w0(-1, -2));
                    z00Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, false));
                } else if (i10 == 4) {
                    View g4Var = new org.telegram.ui.Cells.g4(yzVar.getParentActivity(), 1, 0, false);
                    g4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, false));
                    view = g4Var;
                } else if (i10 == 5) {
                    z00Var = new org.telegram.ui.Components.z00(yzVar.getParentActivity());
                    z00Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, false));
                }
                view2 = z00Var;
            }
            return new f2.l1(view2);
        }
        view2 = view;
        return new f2.l1(view2);
    }
}
