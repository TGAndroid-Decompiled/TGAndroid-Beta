package wg;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import ig.d0;
import ig.o;
import java.util.Date;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.y9;
import s4.e1;
import vi.k0;
import xg.c0;
import xg.r;
import xg.t;
public abstract class e extends mm0 {
    public final u6 f51239c;
    public boolean d;
    public r2 e;
    public TLRPC.TL_payments_checkedGiftCode f51240f;
    public String h;
    public FrameLayout f51241n;

    public e(u6 u6Var) {
        this.f51239c = u6Var;
    }

    @Override
    public final boolean D(e1 e1Var) {
        return false;
    }

    public abstract void E();

    public abstract void F(TLObject tLObject);

    @Override
    public final int h() {
        return 5;
    }

    @Override
    public final int j(int i10) {
        if (i10 != 0) {
            int i11 = 1;
            if (i10 != 1) {
                i11 = 2;
                if (i10 != 2) {
                    i11 = 3;
                    if (i10 != 3) {
                        i11 = 4;
                        if (i10 != 4) {
                            return 5;
                        }
                    }
                }
            }
            return i11;
        }
        return 0;
    }

    @Override
    public final void v(e1 e1Var, int i10) {
        int i11;
        int i12;
        int i13;
        char c10;
        String formatPluralString;
        c0 c0Var;
        String string;
        int i14 = e1Var.f47776f;
        View view = e1Var.f47773a;
        if (i14 != 0) {
            if (i14 != 1) {
                if (i14 != 2) {
                    if (i14 != 3) {
                        if (i14 == 4) {
                            xg.a aVar = (xg.a) view;
                            aVar.setOkStyle(this.d);
                            aVar.setOnClickListener(new org.telegram.ui.web.c(8, this, aVar));
                            TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = this.f51240f;
                            if (tL_payments_checkedGiftCode.boost != null || tL_payments_checkedGiftCode.flags == -1) {
                                aVar.e = false;
                                fi.d dVar = aVar.f51809a;
                                dVar.setShowZero(false);
                                dVar.setEnabled(true);
                                dVar.i(LocaleController.formatString("Close", R.string.Close, new Object[0]), false, true);
                                aVar.setOnClickListener(new d0(this, 25));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    xg.d0 d0Var = (xg.d0) view;
                    d0Var.setTextGravity(17);
                    f7.V(d0Var.getTextView(), y6.G6, null);
                    d0Var.setTopPadding(14);
                    d0Var.setBottomPadding(15);
                    TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode2 = this.f51240f;
                    if (tL_payments_checkedGiftCode2.boost != null) {
                        String str = this.h;
                        if (str != null && !str.isEmpty()) {
                            d0Var.setFixedSize(14);
                            d0Var.setText(null);
                            return;
                        }
                        d0Var.setText(LocaleController.getString(R.string.BoostingLinkNotActivated));
                        return;
                    } else if (this.d) {
                        if (tL_payments_checkedGiftCode2.to_id == -1) {
                            string = LocaleController.getString(R.string.BoostingSendLinkToAnyone);
                        } else {
                            string = LocaleController.getString(R.string.BoostingSendLinkToFriends);
                        }
                        d0Var.setText(AndroidUtilities.replaceSingleTag(string, y6.gc, 0, new c(this, 1), this.f51239c));
                        return;
                    } else {
                        Date date = new Date(this.f51240f.used_date * 1000);
                        d0Var.setText(LocaleController.formatString("BoostingUsedLinkDate", R.string.BoostingUsedLinkDate, LocaleController.formatString("formatDateAtTime", R.string.formatDateAtTime, LocaleController.getInstance().getFormatterYear().format(date), LocaleController.getInstance().getFormatterDay().format(date))));
                        return;
                    }
                }
                c0 c0Var2 = (c0) view;
                final TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode3 = this.f51240f;
                final o oVar = new o(this, 27);
                y9 y9Var = c0Var2.h;
                FrameLayout frameLayout = c0Var2.f51832w;
                y9 y9Var2 = c0Var2.f51828f;
                TextView textView = c0Var2.f51825a;
                TextView textView2 = c0Var2.f51826b;
                u6 u6Var = c0Var2.f51829n;
                Date date2 = new Date(tL_payments_checkedGiftCode3.date * 1000);
                c0Var2.e.setText(LocaleController.formatString("formatDateAtTime", R.string.formatDateAtTime, LocaleController.getInstance().getFormatterYear().format(date2), LocaleController.getInstance().getFormatterDay().format(date2)));
                TextView textView3 = c0Var2.d;
                if (tL_payments_checkedGiftCode3.via_giveaway) {
                    i11 = y6.f23520m5;
                } else {
                    i11 = y6.f23465j5;
                }
                f7.V(textView3, i11, u6Var);
                TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-DialogObject.getPeerDialogId(tL_payments_checkedGiftCode3.from_id)));
                boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
                if (tL_payments_checkedGiftCode3.via_giveaway) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) "**");
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.BoostingGiveaway));
                    spannableStringBuilder.append((CharSequence) "**");
                    textView3.setText(AndroidUtilities.replaceSingleTag(spannableStringBuilder.toString(), y6.gc, 0, new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    oVar.run(tL_payments_checkedGiftCode3);
                                    return;
                                default:
                                    oVar.run(tL_payments_checkedGiftCode3);
                                    return;
                            }
                        }
                    }, u6Var));
                    textView3.setOnClickListener(new org.telegram.ui.web.c(10, oVar, tL_payments_checkedGiftCode3));
                } else {
                    if (isChannelAndNotMegaGroup) {
                        i12 = R.string.BoostingYouWereSelected;
                    } else {
                        i12 = R.string.BoostingYouWereSelectedGroup;
                    }
                    textView3.setText(LocaleController.getString(i12));
                    textView3.setOnClickListener(null);
                }
                int i15 = tL_payments_checkedGiftCode3.months;
                if (i15 == 12) {
                    i13 = 1;
                    formatPluralString = LocaleController.formatPluralString("Years", 1, new Object[0]);
                    c10 = 0;
                } else {
                    i13 = 1;
                    c10 = 0;
                    formatPluralString = LocaleController.formatPluralString("Months", i15, new Object[0]);
                }
                TextView textView4 = c0Var2.f51827c;
                int i16 = R.string.BoostingTelegramPremiumFor;
                String str2 = formatPluralString;
                Object[] objArr = new Object[i13];
                objArr[c10] = str2;
                textView4.setText(LocaleController.formatString("BoostingTelegramPremiumFor", i16, objArr));
                if (chat != null) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                    spannableStringBuilder2.append((CharSequence) "**");
                    spannableStringBuilder2.append((CharSequence) chat.title);
                    spannableStringBuilder2.append((CharSequence) "**");
                    textView.setText(Emoji.replaceEmoji(AndroidUtilities.replaceSingleTag(spannableStringBuilder2.toString(), y6.gc, 0, new k0(6, oVar, chat), u6Var), textView.getPaint().getFontMetricsInt(), false));
                    y9Var2.f(chat, new j9(chat));
                    frameLayout.setOnClickListener(new org.telegram.ui.web.c(11, oVar, chat));
                    c0Var = c0Var2;
                } else {
                    c0Var = c0Var2;
                    final TLRPC.User user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(tL_payments_checkedGiftCode3.from_id.user_id));
                    textView.setText(Emoji.replaceEmoji(UserObject.getFirstName(user), textView.getPaint().getFontMetricsInt(), false));
                    y9Var2.f(user, new j9(0, user));
                    frameLayout.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            switch (r3) {
                                case 0:
                                    oVar.run(user);
                                    return;
                                default:
                                    oVar.run(user);
                                    return;
                            }
                        }
                    });
                }
                if (tL_payments_checkedGiftCode3.to_id == -1 && tL_payments_checkedGiftCode3.via_giveaway) {
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                    spannableStringBuilder3.append((CharSequence) "**");
                    spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.BoostingIncompleteGiveaway));
                    spannableStringBuilder3.append((CharSequence) "**");
                    textView3.setText(AndroidUtilities.replaceSingleTag(spannableStringBuilder3.toString(), y6.gc, 0, new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    oVar.run(tL_payments_checkedGiftCode3);
                                    return;
                                default:
                                    oVar.run(tL_payments_checkedGiftCode3);
                                    return;
                            }
                        }
                    }, u6Var));
                    textView2.setText(LocaleController.getString(R.string.BoostingNoRecipient));
                    f7.V(textView2, y6.f23465j5, u6Var);
                    ((ViewGroup.MarginLayoutParams) textView2.getLayoutParams()).leftMargin = 0;
                    ((ViewGroup.MarginLayoutParams) textView2.getLayoutParams()).rightMargin = 0;
                    y9Var.setVisibility(8);
                } else {
                    final TLRPC.User user2 = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(tL_payments_checkedGiftCode3.to_id));
                    if (user2 != null) {
                        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                        spannableStringBuilder4.append((CharSequence) "**");
                        spannableStringBuilder4.append((CharSequence) UserObject.getFirstName(user2));
                        spannableStringBuilder4.append((CharSequence) "**");
                        textView2.setText(Emoji.replaceEmoji(AndroidUtilities.replaceSingleTag(spannableStringBuilder4.toString(), y6.gc, 0, new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        oVar.run(user2);
                                        return;
                                    default:
                                        oVar.run(user2);
                                        return;
                                }
                            }
                        }, u6Var), textView2.getPaint().getFontMetricsInt(), false));
                        y9Var.f(user2, new j9(0, user2));
                        c0Var.f51833x.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view2) {
                                switch (r3) {
                                    case 0:
                                        oVar.run(user2);
                                        return;
                                    default:
                                        oVar.run(user2);
                                        return;
                                }
                            }
                        });
                    }
                }
                if (tL_payments_checkedGiftCode3.boost != null) {
                    c0Var.f51834y.setVisibility(8);
                    return;
                }
                return;
            }
            t tVar = (t) view;
            tVar.setSlug(this.h);
            if (this.f51240f.boost != null && this.h == null) {
                tVar.a(new c(this, 0));
            }
            String str3 = this.h;
            if ((str3 == null || str3.isEmpty()) && this.f51240f.to_id == -1) {
                tVar.a(new c(this, 0));
                return;
            }
            return;
        }
        r rVar = (r) view;
        if (this.d) {
            rVar.f51862c.setText(LocaleController.formatString("BoostingGiftLink", R.string.BoostingGiftLink, new Object[0]));
            rVar.d.setText(AndroidUtilities.replaceTags(LocaleController.formatString("BoostingLinkAllows", R.string.BoostingLinkAllows, new Object[0])));
        } else {
            rVar.f51862c.setText(LocaleController.formatString("BoostingUsedGiftLink", R.string.BoostingUsedGiftLink, new Object[0]));
            rVar.d.setText(AndroidUtilities.replaceTags(LocaleController.formatString("BoostingLinkUsed", R.string.BoostingLinkUsed, new Object[0])));
        }
        TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode4 = this.f51240f;
        if (tL_payments_checkedGiftCode4.boost != null) {
            long j10 = tL_payments_checkedGiftCode4.to_id;
            final o oVar2 = new o(this, 27);
            rVar.f51862c.setText(LocaleController.formatString("BoostingGiftLink", R.string.BoostingGiftLink, new Object[0]));
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.BoostingLinkAllowsToUser));
            final TLRPC.User user3 = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j10));
            rVar.d.setText(AndroidUtilities.replaceCharSequence("%1$s", replaceTags, AndroidUtilities.replaceSingleTag("**" + UserObject.getUserName(user3) + "**", y6.gc, 2, new Runnable() {
                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            oVar2.run(user3);
                            return;
                        default:
                            oVar2.run(user3);
                            return;
                    }
                }
            }, rVar.e)));
        }
        if (this.f51240f.to_id == -1) {
            rVar.f51862c.setText(LocaleController.formatString("BoostingGiftLink", R.string.BoostingGiftLink, new Object[0]));
            rVar.d.setText(AndroidUtilities.replaceTags(LocaleController.formatString("BoostingLinkAllowsAnyone", R.string.BoostingLinkAllowsAnyone, new Object[0])));
        }
    }

    @Override
    public final e1 x(ViewGroup viewGroup, int i10) {
        View tVar;
        Context context = viewGroup.getContext();
        u6 u6Var = this.f51239c;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            tVar = new r(context, u6Var);
                        } else {
                            tVar = new View(context);
                        }
                    } else {
                        tVar = new xg.a(context, u6Var);
                        tVar.setPadding(0, 0, 0, AndroidUtilities.dp(14.0f));
                    }
                } else {
                    tVar = new xg.d0(context, u6Var);
                }
            } else {
                tVar = new c0(context, u6Var);
            }
        } else {
            tVar = new t(context, u6Var);
        }
        return ic.a.n(tVar, tVar, -1, -2);
    }
}
