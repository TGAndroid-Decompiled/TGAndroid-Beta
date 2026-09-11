package vg;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.internal.vision.e2;
import java.util.Date;
import ji.m4;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.x9;
import org.telegram.ui.web.b1;
import org.telegram.ui.wy0;
import s4.c1;
import ug.r;
import wg.c0;
import wg.d0;
import wg.t;
public abstract class e extends kl0 {
    public final f6 f47805c;
    public boolean d;
    public n2 f47806e;
    public TLRPC.TL_payments_checkedGiftCode f47807f;
    public String h;
    public FrameLayout f47808n;

    public e(f6 f6Var) {
        this.f47805c = f6Var;
    }

    @Override
    public final boolean D(c1 c1Var) {
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
    public final void v(c1 c1Var, int i10) {
        int i11;
        int i12;
        int i13;
        char c10;
        String formatPluralString;
        String string;
        int i14 = c1Var.f45742f;
        View view = c1Var.f45738a;
        if (i14 != 0) {
            if (i14 != 1) {
                if (i14 != 2) {
                    if (i14 != 3) {
                        if (i14 == 4) {
                            wg.a aVar = (wg.a) view;
                            aVar.setOkStyle(this.d);
                            aVar.setOnClickListener(new wy0(20, this, aVar));
                            TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = this.f47807f;
                            if (tL_payments_checkedGiftCode.boost != null || tL_payments_checkedGiftCode.flags == -1) {
                                aVar.f48497e = false;
                                di.d dVar = aVar.f48494a;
                                dVar.setShowZero(false);
                                dVar.setEnabled(true);
                                dVar.g(LocaleController.formatString("Close", R.string.Close, new Object[0]), false, true);
                                aVar.setOnClickListener(new m4(this, 14));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    d0 d0Var = (d0) view;
                    d0Var.setTextGravity(17);
                    d0Var.setTextColor(j6.w0(null, j6.G6, false));
                    d0Var.setTopPadding(14);
                    d0Var.setBottomPadding(15);
                    TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode2 = this.f47807f;
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
                        d0Var.setText(AndroidUtilities.replaceSingleTag(string, j6.gc, 0, new c(this, 1), this.f47805c));
                        return;
                    } else {
                        Date date = new Date(this.f47807f.used_date * 1000);
                        d0Var.setText(LocaleController.formatString("BoostingUsedLinkDate", R.string.BoostingUsedLinkDate, LocaleController.formatString("formatDateAtTime", R.string.formatDateAtTime, LocaleController.getInstance().getFormatterYear().format(date), LocaleController.getInstance().getFormatterDay().format(date))));
                        return;
                    }
                }
                c0 c0Var = (c0) view;
                final TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode3 = this.f47807f;
                final b1 b1Var = new b1(this, 14);
                x9 x9Var = c0Var.h;
                FrameLayout frameLayout = c0Var.f48519w;
                x9 x9Var2 = c0Var.f48515f;
                TextView textView = c0Var.f48511a;
                TextView textView2 = c0Var.f48512b;
                f6 f6Var = c0Var.f48516n;
                Date date2 = new Date(tL_payments_checkedGiftCode3.date * 1000);
                c0Var.f48514e.setText(LocaleController.formatString("formatDateAtTime", R.string.formatDateAtTime, LocaleController.getInstance().getFormatterYear().format(date2), LocaleController.getInstance().getFormatterDay().format(date2)));
                TextView textView3 = c0Var.d;
                if (tL_payments_checkedGiftCode3.via_giveaway) {
                    i11 = j6.f20826m5;
                } else {
                    i11 = j6.f20770j5;
                }
                textView3.setTextColor(j6.v0(i11, f6Var));
                TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-DialogObject.getPeerDialogId(tL_payments_checkedGiftCode3.from_id)));
                boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
                if (tL_payments_checkedGiftCode3.via_giveaway) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) "**");
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.BoostingGiveaway));
                    spannableStringBuilder.append((CharSequence) "**");
                    textView3.setText(AndroidUtilities.replaceSingleTag(spannableStringBuilder.toString(), j6.gc, 0, new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    b1Var.run(tL_payments_checkedGiftCode3);
                                    return;
                                default:
                                    b1Var.run(tL_payments_checkedGiftCode3);
                                    return;
                            }
                        }
                    }, f6Var));
                    textView3.setOnClickListener(new wy0(22, b1Var, tL_payments_checkedGiftCode3));
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
                TextView textView4 = c0Var.f48513c;
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
                    textView.setText(Emoji.replaceEmoji(AndroidUtilities.replaceSingleTag(spannableStringBuilder2.toString(), j6.gc, 0, new r(7, b1Var, chat), f6Var), textView.getPaint().getFontMetricsInt(), false));
                    x9Var2.e(chat, new i9(chat));
                    frameLayout.setOnClickListener(new wy0(23, b1Var, chat));
                } else {
                    final TLRPC.User user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(tL_payments_checkedGiftCode3.from_id.user_id));
                    textView.setText(Emoji.replaceEmoji(UserObject.getFirstName(user), textView.getPaint().getFontMetricsInt(), false));
                    x9Var2.e(user, new i9(0, user));
                    frameLayout.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            switch (r3) {
                                case 0:
                                    b1Var.run(user);
                                    return;
                                default:
                                    b1Var.run(user);
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
                    textView3.setText(AndroidUtilities.replaceSingleTag(spannableStringBuilder3.toString(), j6.gc, 0, new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    b1Var.run(tL_payments_checkedGiftCode3);
                                    return;
                                default:
                                    b1Var.run(tL_payments_checkedGiftCode3);
                                    return;
                            }
                        }
                    }, f6Var));
                    textView2.setText(LocaleController.getString(R.string.BoostingNoRecipient));
                    textView2.setTextColor(j6.v0(j6.f20770j5, f6Var));
                    ((ViewGroup.MarginLayoutParams) textView2.getLayoutParams()).leftMargin = 0;
                    ((ViewGroup.MarginLayoutParams) textView2.getLayoutParams()).rightMargin = 0;
                    x9Var.setVisibility(8);
                } else {
                    final TLRPC.User user2 = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(tL_payments_checkedGiftCode3.to_id));
                    if (user2 != null) {
                        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                        spannableStringBuilder4.append((CharSequence) "**");
                        spannableStringBuilder4.append((CharSequence) UserObject.getFirstName(user2));
                        spannableStringBuilder4.append((CharSequence) "**");
                        textView2.setText(Emoji.replaceEmoji(AndroidUtilities.replaceSingleTag(spannableStringBuilder4.toString(), j6.gc, 0, new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        b1Var.run(user2);
                                        return;
                                    default:
                                        b1Var.run(user2);
                                        return;
                                }
                            }
                        }, f6Var), textView2.getPaint().getFontMetricsInt(), false));
                        x9Var.e(user2, new i9(0, user2));
                        c0Var.f48520x.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view2) {
                                switch (r3) {
                                    case 0:
                                        b1Var.run(user2);
                                        return;
                                    default:
                                        b1Var.run(user2);
                                        return;
                                }
                            }
                        });
                    }
                }
                if (tL_payments_checkedGiftCode3.boost != null) {
                    c0Var.f48521y.setVisibility(8);
                    return;
                }
                return;
            }
            t tVar = (t) view;
            tVar.setSlug(this.h);
            if (this.f47807f.boost != null && this.h == null) {
                tVar.a(new c(this, 0));
            }
            String str3 = this.h;
            if ((str3 == null || str3.isEmpty()) && this.f47807f.to_id == -1) {
                tVar.a(new c(this, 0));
                return;
            }
            return;
        }
        wg.r rVar = (wg.r) view;
        if (this.d) {
            rVar.f48549c.setText(LocaleController.formatString("BoostingGiftLink", R.string.BoostingGiftLink, new Object[0]));
            rVar.d.setText(AndroidUtilities.replaceTags(LocaleController.formatString("BoostingLinkAllows", R.string.BoostingLinkAllows, new Object[0])));
        } else {
            rVar.f48549c.setText(LocaleController.formatString("BoostingUsedGiftLink", R.string.BoostingUsedGiftLink, new Object[0]));
            rVar.d.setText(AndroidUtilities.replaceTags(LocaleController.formatString("BoostingLinkUsed", R.string.BoostingLinkUsed, new Object[0])));
        }
        TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode4 = this.f47807f;
        if (tL_payments_checkedGiftCode4.boost != null) {
            long j3 = tL_payments_checkedGiftCode4.to_id;
            final b1 b1Var2 = new b1(this, 14);
            rVar.f48549c.setText(LocaleController.formatString("BoostingGiftLink", R.string.BoostingGiftLink, new Object[0]));
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.BoostingLinkAllowsToUser));
            final TLRPC.User user3 = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j3));
            rVar.d.setText(AndroidUtilities.replaceCharSequence("%1$s", replaceTags, AndroidUtilities.replaceSingleTag("**" + UserObject.getUserName(user3) + "**", j6.gc, 2, new Runnable() {
                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            b1Var2.run(user3);
                            return;
                        default:
                            b1Var2.run(user3);
                            return;
                    }
                }
            }, rVar.f48550e)));
        }
        if (this.f47807f.to_id == -1) {
            rVar.f48549c.setText(LocaleController.formatString("BoostingGiftLink", R.string.BoostingGiftLink, new Object[0]));
            rVar.d.setText(AndroidUtilities.replaceTags(LocaleController.formatString("BoostingLinkAllowsAnyone", R.string.BoostingLinkAllowsAnyone, new Object[0])));
        }
    }

    @Override
    public final c1 x(ViewGroup viewGroup, int i10) {
        View tVar;
        Context context = viewGroup.getContext();
        f6 f6Var = this.f47805c;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            tVar = new wg.r(context, f6Var);
                        } else {
                            tVar = new View(context);
                        }
                    } else {
                        tVar = new wg.a(context, f6Var);
                        tVar.setPadding(0, 0, 0, AndroidUtilities.dp(14.0f));
                    }
                } else {
                    tVar = new d0(context, f6Var);
                }
            } else {
                tVar = new c0(context, f6Var);
            }
        } else {
            tVar = new t(context, f6Var);
        }
        return e2.l(tVar, tVar, -1, -2);
    }
}
