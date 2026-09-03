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
public final class zz extends org.telegram.ui.Components.ql0 {
    public final a00 f40905c;

    public zz(a00 a00Var) {
        this.f40905c = a00Var;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        if (l1Var.f5777f == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f40905c.E;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        a00 a00Var = this.f40905c;
        if (i10 != a00Var.L && i10 != a00Var.H) {
            if (i10 == a00Var.F) {
                return 3;
            }
            if (i10 >= a00Var.J && i10 < a00Var.K) {
                return 4;
            }
            if (i10 != a00Var.I && i10 != a00Var.G) {
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
        a00 a00Var = this.f40905c;
        ArrayList arrayList = a00Var.f32401f;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = a00Var.d;
        int i12 = l1Var.f5777f;
        View view = l1Var.f5774a;
        if (i12 == 0) {
            a00Var.N = (qz) view;
            a00Var.g0();
        } else if (i12 == 2) {
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
            Activity parentActivity = a00Var.getParentActivity();
            if (i10 == a00Var.L) {
                i11 = R.drawable.greydivider_bottom;
            } else {
                i11 = R.drawable.greydivider;
            }
            z8Var.setBackground(org.telegram.ui.ActionBar.j6.V0(parentActivity, i11, org.telegram.ui.ActionBar.j6.f19846b7));
            if (i10 == a00Var.L) {
                z8Var.setFixedSize(0);
                if (tL_exportedChatlistInvite != null && !arrayList.isEmpty()) {
                    z8Var.setText(LocaleController.getString(R.string.FilterInviteHint));
                    return;
                } else {
                    z8Var.setText(LocaleController.getString(R.string.FilterInviteHintNo));
                    return;
                }
            }
            z8Var.setFixedSize(12);
        } else {
            int i13 = 1;
            String str4 = null;
            if (i12 == 3) {
                tz tzVar = (tz) view;
                if (tL_exportedChatlistInvite == null) {
                    str3 = null;
                } else {
                    str3 = tL_exportedChatlistInvite.url;
                }
                gg.q qVar = tzVar.h;
                org.telegram.ui.ActionBar.k5 k5Var = tzVar.f38616c;
                TextView textView = tzVar.f38618n;
                ImageView imageView = tzVar.d;
                gg.q qVar2 = tzVar.f38617f;
                tzVar.f38620s = str3;
                if (str3 != null) {
                    if (str3.startsWith("http://")) {
                        str3 = str3.substring(7);
                    }
                    if (str3.startsWith("https://")) {
                        str3 = str3.substring(8);
                    }
                }
                k5Var.l(str3, false);
                float f11 = tzVar.v;
                if (str3 == null) {
                    i13 = 0;
                }
                if (f11 != i13) {
                    ValueAnimator valueAnimator = tzVar.f38621w;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        tzVar.f38621w = null;
                    }
                    if (str3 != null) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    tzVar.v = f10;
                    sz szVar = tzVar.e;
                    szVar.f38337b = f10;
                    szVar.invalidate();
                    qVar2.setAlpha(tzVar.v);
                    tzVar.h.setAlpha(tzVar.v);
                    imageView.setAlpha(tzVar.v);
                    textView.setAlpha(1.0f - tzVar.v);
                    k5Var.setAlpha(tzVar.v);
                    tzVar.f38615b.setAlpha(1.0f - tzVar.v);
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
                org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
                Long l10 = (Long) a00Var.h.get(i10 - a00Var.J);
                long longValue = l10.longValue();
                if (longValue >= 0) {
                    TLRPC.User user = a00Var.getMessagesController().getUser(l10);
                    if (user != null) {
                        str2 = UserObject.getUserName(user);
                        chat = user;
                    } else {
                        str2 = null;
                        chat = user;
                    }
                } else {
                    TLRPC.Chat chat2 = a00Var.getMessagesController().getChat(Long.valueOf(-longValue));
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
                    f4Var.setForbiddenCheck(false);
                    f4Var.c(a00Var.e.contains(l10), false);
                } else {
                    f4Var.setForbiddenCheck(true);
                    f4Var.c(false, false);
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
                f4Var.setTag(l10);
                f4Var.d(chat, str2, str4);
            } else if (i12 == 5) {
                org.telegram.ui.Components.a10 a10Var = (org.telegram.ui.Components.a10) view;
                if (a10Var == a00Var.M) {
                    a00Var.M = null;
                }
                if (i10 == a00Var.G) {
                    a10Var.b(LocaleController.getString(R.string.InviteLink), false);
                    a10Var.a("", null);
                    return;
                }
                a00Var.M = a10Var;
                if (tL_exportedChatlistInvite != null && !arrayList.isEmpty()) {
                    a00Var.f0(false);
                    return;
                }
                a10Var.b(LocaleController.getString(R.string.FilterInviteHeaderChatsNo), false);
                a10Var.a("", null);
            }
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View a10Var;
        View view;
        a00 a00Var = this.f40905c;
        View view2 = null;
        if (i10 == 0) {
            Activity parentActivity = a00Var.getParentActivity();
            int i11 = R.raw.folder_share;
            ?? frameLayout = new FrameLayout(parentActivity);
            ?? imageView = new ImageView(parentActivity);
            imageView.f(i11, 90, 90, null);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.d();
            imageView.setImportantForAccessibility(2);
            frameLayout.addView(imageView, k7.b6.d(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
            ih.s sVar = new ih.s(parentActivity);
            frameLayout.f37654a = sVar;
            sVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.B6, false));
            sVar.setTextSize(1, 14.0f);
            sVar.setGravity(17);
            sVar.setLines(2);
            frameLayout.addView(sVar, k7.b6.d(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
            view = frameLayout;
        } else {
            if (i10 == 2) {
                view2 = new org.telegram.ui.Cells.z8(a00Var.getParentActivity());
            } else {
                if (i10 == 3) {
                    a10Var = new yz(this, a00Var.getParentActivity(), a00Var);
                    a10Var.setLayoutParams(new f2.w0(-1, -2));
                    a10Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false));
                } else if (i10 == 4) {
                    View f4Var = new org.telegram.ui.Cells.f4(a00Var.getParentActivity(), 1, 0, false);
                    f4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false));
                    view = f4Var;
                } else if (i10 == 5) {
                    a10Var = new org.telegram.ui.Components.a10(a00Var.getParentActivity());
                    a10Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false));
                }
                view2 = a10Var;
            }
            return new f2.l1(view2);
        }
        view2 = view;
        return new f2.l1(view2);
    }
}
