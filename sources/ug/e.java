package ug;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.internal.vision.e2;
import ii.q1;
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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.voip.o;
import org.telegram.ui.Components.w9;
import org.telegram.ui.ny0;
import s4.c1;
import u2.i0;
import vg.c0;
import vg.d0;
import vg.r;
import vg.t;
public abstract class e extends vl0 {
    public final d6 f43991c;
    public boolean d;
    public m2 e;
    public TLRPC.TL_payments_checkedGiftCode f43992f;
    public String h;
    public FrameLayout f43993n;

    public e(d6 d6Var) {
        this.f43991c = d6Var;
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
        int i14 = c1Var.f42949f;
        View view = c1Var.f42946a;
        if (i14 != 0) {
            if (i14 != 1) {
                if (i14 != 2) {
                    if (i14 != 3) {
                        if (i14 == 4) {
                            vg.a aVar = (vg.a) view;
                            aVar.setOkStyle(this.d);
                            aVar.setOnClickListener(new ny0(20, this, aVar));
                            TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = this.f43992f;
                            if (tL_payments_checkedGiftCode.boost != null || tL_payments_checkedGiftCode.flags == -1) {
                                aVar.e = false;
                                ci.d dVar = aVar.f44564a;
                                dVar.setShowZero(false);
                                dVar.setEnabled(true);
                                dVar.g(LocaleController.formatString("Close", R.string.Close, new Object[0]), false, true);
                                aVar.setOnClickListener(new o(this, 13));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    d0 d0Var = (d0) view;
                    d0Var.setTextGravity(17);
                    d0Var.setTextColor(h6.w0(null, h6.G6, false));
                    d0Var.setTopPadding(14);
                    d0Var.setBottomPadding(15);
                    TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode2 = this.f43992f;
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
                        d0Var.setText(AndroidUtilities.replaceSingleTag(string, h6.gc, 0, new c(this, 1), this.f43991c));
                        return;
                    } else {
                        Date date = new Date(this.f43992f.used_date * 1000);
                        d0Var.setText(LocaleController.formatString("BoostingUsedLinkDate", R.string.BoostingUsedLinkDate, LocaleController.formatString("formatDateAtTime", R.string.formatDateAtTime, LocaleController.getInstance().getFormatterYear().format(date), LocaleController.getInstance().getFormatterDay().format(date))));
                        return;
                    }
                }
                c0 c0Var = (c0) view;
                final TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode3 = this.f43992f;
                final q1 q1Var = new q1(this, 17);
                w9 w9Var = c0Var.h;
                FrameLayout frameLayout = c0Var.f44586w;
                w9 w9Var2 = c0Var.f44582f;
                TextView textView = c0Var.f44579a;
                TextView textView2 = c0Var.f44580b;
                d6 d6Var = c0Var.f44583n;
                Date date2 = new Date(tL_payments_checkedGiftCode3.date * 1000);
                c0Var.e.setText(LocaleController.formatString("formatDateAtTime", R.string.formatDateAtTime, LocaleController.getInstance().getFormatterYear().format(date2), LocaleController.getInstance().getFormatterDay().format(date2)));
                TextView textView3 = c0Var.d;
                if (tL_payments_checkedGiftCode3.via_giveaway) {
                    i11 = h6.f19208m5;
                } else {
                    i11 = h6.f19151j5;
                }
                textView3.setTextColor(h6.v0(i11, d6Var));
                TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-DialogObject.getPeerDialogId(tL_payments_checkedGiftCode3.from_id)));
                boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
                if (tL_payments_checkedGiftCode3.via_giveaway) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) "**");
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.BoostingGiveaway));
                    spannableStringBuilder.append((CharSequence) "**");
                    textView3.setText(AndroidUtilities.replaceSingleTag(spannableStringBuilder.toString(), h6.gc, 0, new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    q1Var.run(tL_payments_checkedGiftCode3);
                                    return;
                                default:
                                    q1Var.run(tL_payments_checkedGiftCode3);
                                    return;
                            }
                        }
                    }, d6Var));
                    textView3.setOnClickListener(new ny0(22, q1Var, tL_payments_checkedGiftCode3));
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
                TextView textView4 = c0Var.f44581c;
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
                    textView.setText(Emoji.replaceEmoji(AndroidUtilities.replaceSingleTag(spannableStringBuilder2.toString(), h6.gc, 0, new i0(7, q1Var, chat), d6Var), textView.getPaint().getFontMetricsInt(), false));
                    w9Var2.e(chat, new h9(chat));
                    frameLayout.setOnClickListener(new ny0(23, q1Var, chat));
                } else {
                    final TLRPC.User user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(tL_payments_checkedGiftCode3.from_id.user_id));
                    textView.setText(Emoji.replaceEmoji(UserObject.getFirstName(user), textView.getPaint().getFontMetricsInt(), false));
                    w9Var2.e(user, new h9(0, user));
                    frameLayout.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            switch (r3) {
                                case 0:
                                    q1Var.run(user);
                                    return;
                                default:
                                    q1Var.run(user);
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
                    textView3.setText(AndroidUtilities.replaceSingleTag(spannableStringBuilder3.toString(), h6.gc, 0, new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    q1Var.run(tL_payments_checkedGiftCode3);
                                    return;
                                default:
                                    q1Var.run(tL_payments_checkedGiftCode3);
                                    return;
                            }
                        }
                    }, d6Var));
                    textView2.setText(LocaleController.getString(R.string.BoostingNoRecipient));
                    textView2.setTextColor(h6.v0(h6.f19151j5, d6Var));
                    ((ViewGroup.MarginLayoutParams) textView2.getLayoutParams()).leftMargin = 0;
                    ((ViewGroup.MarginLayoutParams) textView2.getLayoutParams()).rightMargin = 0;
                    w9Var.setVisibility(8);
                } else {
                    final TLRPC.User user2 = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(tL_payments_checkedGiftCode3.to_id));
                    if (user2 != null) {
                        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                        spannableStringBuilder4.append((CharSequence) "**");
                        spannableStringBuilder4.append((CharSequence) UserObject.getFirstName(user2));
                        spannableStringBuilder4.append((CharSequence) "**");
                        textView2.setText(Emoji.replaceEmoji(AndroidUtilities.replaceSingleTag(spannableStringBuilder4.toString(), h6.gc, 0, new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        q1Var.run(user2);
                                        return;
                                    default:
                                        q1Var.run(user2);
                                        return;
                                }
                            }
                        }, d6Var), textView2.getPaint().getFontMetricsInt(), false));
                        w9Var.e(user2, new h9(0, user2));
                        c0Var.f44587x.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view2) {
                                switch (r3) {
                                    case 0:
                                        q1Var.run(user2);
                                        return;
                                    default:
                                        q1Var.run(user2);
                                        return;
                                }
                            }
                        });
                    }
                }
                if (tL_payments_checkedGiftCode3.boost != null) {
                    c0Var.f44588y.setVisibility(8);
                    return;
                }
                return;
            }
            t tVar = (t) view;
            tVar.setSlug(this.h);
            if (this.f43992f.boost != null && this.h == null) {
                tVar.a(new c(this, 0));
            }
            String str3 = this.h;
            if ((str3 == null || str3.isEmpty()) && this.f43992f.to_id == -1) {
                tVar.a(new c(this, 0));
                return;
            }
            return;
        }
        r rVar = (r) view;
        if (this.d) {
            rVar.f44614c.setText(LocaleController.formatString("BoostingGiftLink", R.string.BoostingGiftLink, new Object[0]));
            rVar.d.setText(AndroidUtilities.replaceTags(LocaleController.formatString("BoostingLinkAllows", R.string.BoostingLinkAllows, new Object[0])));
        } else {
            rVar.f44614c.setText(LocaleController.formatString("BoostingUsedGiftLink", R.string.BoostingUsedGiftLink, new Object[0]));
            rVar.d.setText(AndroidUtilities.replaceTags(LocaleController.formatString("BoostingLinkUsed", R.string.BoostingLinkUsed, new Object[0])));
        }
        TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode4 = this.f43992f;
        if (tL_payments_checkedGiftCode4.boost != null) {
            long j3 = tL_payments_checkedGiftCode4.to_id;
            final q1 q1Var2 = new q1(this, 17);
            rVar.f44614c.setText(LocaleController.formatString("BoostingGiftLink", R.string.BoostingGiftLink, new Object[0]));
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.BoostingLinkAllowsToUser));
            final TLRPC.User user3 = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j3));
            rVar.d.setText(AndroidUtilities.replaceCharSequence("%1$s", replaceTags, AndroidUtilities.replaceSingleTag("**" + UserObject.getUserName(user3) + "**", h6.gc, 2, new Runnable() {
                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            q1Var2.run(user3);
                            return;
                        default:
                            q1Var2.run(user3);
                            return;
                    }
                }
            }, rVar.e)));
        }
        if (this.f43992f.to_id == -1) {
            rVar.f44614c.setText(LocaleController.formatString("BoostingGiftLink", R.string.BoostingGiftLink, new Object[0]));
            rVar.d.setText(AndroidUtilities.replaceTags(LocaleController.formatString("BoostingLinkAllowsAnyone", R.string.BoostingLinkAllowsAnyone, new Object[0])));
        }
    }

    @Override
    public final c1 x(ViewGroup viewGroup, int i10) {
        View tVar;
        Context context = viewGroup.getContext();
        d6 d6Var = this.f43991c;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            tVar = new r(context, d6Var);
                        } else {
                            tVar = new View(context);
                        }
                    } else {
                        tVar = new vg.a(context, d6Var);
                        tVar.setPadding(0, 0, 0, AndroidUtilities.dp(14.0f));
                    }
                } else {
                    tVar = new d0(context, d6Var);
                }
            } else {
                tVar = new c0(context, d6Var);
            }
        } else {
            tVar = new t(context, d6Var);
        }
        return e2.k(tVar, tVar, -1, -2);
    }
}
