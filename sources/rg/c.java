package rg;

import ai.l;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.SparseArray;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.l10;
import org.telegram.messenger.m5;
import org.telegram.messenger.pr;
import org.telegram.messenger.t0;
import org.telegram.messenger.t3;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.c70;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.u8;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xp;
import org.telegram.ui.m91;
import org.telegram.ui.wm;
import r4.u;
public abstract class c {
    public static final int f54516a = 0;

    static {
        new SparseArray();
    }

    public static void a(wm wmVar, pr prVar) {
        TLRPC.TL_forumTopic f10;
        if (prVar.f24798b != 0 && (f10 = wmVar.getMessagesController().f23102q7.f(-prVar.f24797a, prVar.f24798b)) != null) {
            if (prVar.f24797a > 0) {
                if (l10.u(wmVar.getMessagesController().a2(Long.valueOf(prVar.f24797a)))) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new zi(wmVar.getCurrentAccount(), f10.topicStartMessage, false, false));
                    wmVar.Rb(arrayList, null, f10.f27053id, f10.read_inbox_max_id, f10.read_outbox_max_id, f10);
                    wmVar.getMessagesController().J4(-prVar.f24797a, prVar.f24798b);
                    return;
                }
                return;
            }
            TLRPC.Chat M0 = wmVar.getMessagesController().M0(Long.valueOf(-prVar.f24797a));
            if (M0 == null) {
                return;
            }
            if (t3.p0(M0)) {
                if (t3.A(h10.f22829t0, M0, 24)) {
                    int i3 = f10.read_inbox_max_id;
                    int i10 = f10.read_outbox_max_id;
                    wmVar.f51563z4 = i3;
                    wmVar.A4 = i10;
                    wmVar.B4 = Math.max(1, i3);
                    wmVar.f51475s4 = m5.o(f10.from_id);
                    wmVar.dd();
                    wmVar.vd(false);
                    wmVar.Lc(false);
                }
            } else {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new zi(wmVar.getCurrentAccount(), f10.topicStartMessage, false, false));
                wmVar.Rb(arrayList2, M0, f10.f27053id, f10.read_inbox_max_id, f10.read_outbox_max_id, f10);
            }
            wmVar.getMessagesController().J4(-prVar.f24797a, prVar.f24798b);
        }
    }

    public static void b(zi ziVar) {
        TLRPC.TL_forumTopic f10;
        TLRPC.Message message = ziVar.f26868k;
        int i3 = ziVar.I1;
        if (zi.B0(message) <= 0 && (f10 = hp.s1(i3).f23102q7.f(-zi.B0(ziVar.f26868k), zi.c2(i3, ziVar.f26868k, true, false))) != null) {
            Drawable drawable = ziVar.f26853g2[0];
            if (drawable instanceof a) {
                ((a) drawable).b(f10.icon_color);
            }
        }
    }

    public static b c(Context context, float f10, int i3, boolean z10) {
        int i10;
        if (context == null) {
            return null;
        }
        ?? drawable = new Drawable();
        Resources resources = context.getResources();
        if (z10) {
            i10 = 2131232145;
        } else {
            i10 = 2131232144;
        }
        drawable.f54513a = resources.getDrawable(i10).mutate();
        drawable.f54514b = f10;
        drawable.a(i3);
        return drawable;
    }

    public static xp d(int i3, String str) {
        String str2;
        a aVar = new a(i3);
        c70 c70Var = new c70(1, null);
        String trim = str.trim();
        if (trim.length() >= 1) {
            str2 = trim.substring(0, 1).toUpperCase();
        } else {
            str2 = "";
        }
        c70Var.a(str2);
        xp xpVar = new xp(aVar, c70Var, 0, 0);
        xpVar.f40447x = true;
        return xpVar;
    }

    public static xp e(TLRPC.TL_forumTopic tL_forumTopic) {
        if (tL_forumTopic == null) {
            return null;
        }
        return d(tL_forumTopic.icon_color, tL_forumTopic.title);
    }

    public static void f(ArrayList arrayList, long j10) {
        if (arrayList != null) {
            int i3 = 0;
            while (i3 < arrayList.size()) {
                if (j10 != zi.c2(((zi) arrayList.get(i3)).I1, ((zi) arrayList.get(i3)).f26868k, true, false)) {
                    arrayList.remove(i3);
                    i3--;
                }
                i3++;
            }
        }
    }

    public static wm g(d2 d2Var, long j10, TLRPC.TL_forumTopic tL_forumTopic, int i3, Bundle bundle) {
        TLRPC.TL_forumTopic tL_forumTopic2;
        TLRPC.TL_forumTopic f10;
        if (d2Var != null && tL_forumTopic != null) {
            TLRPC.Chat M0 = d2Var.getMessagesController().M0(Long.valueOf(j10));
            bundle.putLong("chat_id", j10);
            if (i3 != 0) {
                bundle.putInt("message_id", i3);
            } else if (tL_forumTopic.read_inbox_max_id == 0) {
                bundle.putInt("message_id", tL_forumTopic.f27053id);
            }
            bundle.putInt("unread_count", tL_forumTopic.unread_count);
            bundle.putBoolean("historyPreloaded", false);
            wm wmVar = new wm(bundle);
            TLRPC.Message message = tL_forumTopic.topicStartMessage;
            if (message == null && (f10 = d2Var.getMessagesController().f23102q7.f(j10, tL_forumTopic.f27053id)) != null) {
                message = f10.topicStartMessage;
                tL_forumTopic2 = f10;
            } else {
                tL_forumTopic2 = tL_forumTopic;
            }
            if (message != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new zi(d2Var.getCurrentAccount(), message, false, false));
                wmVar.Rb(arrayList, M0, tL_forumTopic2.f27053id, tL_forumTopic2.read_inbox_max_id, tL_forumTopic2.read_outbox_max_id, tL_forumTopic2);
                if (i3 != 0) {
                    wmVar.f51273c8 = i3;
                }
                return wmVar;
            }
            return null;
        }
        return null;
    }

    public static String h(int i3, long j10) {
        return i(i3, hp.s1(i3).M0(Long.valueOf(-j10)), true);
    }

    public static String i(int i3, TLRPC.Chat chat, boolean z10) {
        if (t3.p0(chat)) {
            TLRPC.Chat M0 = hp.s1(i3).M0(Long.valueOf(chat.linked_monoforum_id));
            if (M0 != null) {
                String str = M0.title;
                if (z10) {
                    return str;
                }
                return bd.a0(null, null, 2131748354, str);
            }
        } else if (chat != null && chat.linked_monoforum_id != 0) {
            String str2 = chat.title;
            if (z10) {
                return str2;
            }
            return bd.a0(null, null, 2131748354, str2);
        }
        if (chat == null) {
            return null;
        }
        return chat.title;
    }

    public static CharSequence j(TLRPC.ForumTopic forumTopic, Paint paint, Drawable[] drawableArr) {
        int color;
        int textSize;
        int textSize2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (forumTopic instanceof TLRPC.TL_forumTopic) {
            TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) forumTopic;
            Paint.FontMetricsInt fontMetricsInt = null;
            if (tL_forumTopic.f27053id == 1) {
                try {
                    Context context = t0.f25457b;
                    if (paint == null) {
                        color = k6.x0(null, k6.f28088od, false);
                    } else {
                        color = paint.getColor();
                    }
                    b c2 = c(context, 1.0f, color, false);
                    if (paint == null) {
                        textSize = g0.L(14.0f);
                    } else {
                        textSize = (int) paint.getTextSize();
                    }
                    if (paint == null) {
                        textSize2 = g0.L(14.0f);
                    } else {
                        textSize2 = (int) paint.getTextSize();
                    }
                    c2.setBounds(0, 0, textSize, textSize2);
                    spannableStringBuilder.append((CharSequence) " ");
                    if (drawableArr != null) {
                        drawableArr[0] = c2;
                    }
                    spannableStringBuilder.setSpan(new ImageSpan(c2, 2), 0, 1, 33);
                } catch (Exception unused) {
                }
            } else if (tL_forumTopic.icon_emoji_id != 0) {
                spannableStringBuilder.append((CharSequence) " ");
                long j10 = tL_forumTopic.icon_emoji_id;
                if (paint != null) {
                    fontMetricsInt = paint.getFontMetricsInt();
                }
                p5 p5Var = new p5(j10, 0.95f, fontMetricsInt);
                spannableStringBuilder.setSpan(p5Var, 0, 1, 33);
                p5Var.top = true;
                p5Var.cacheType = 13;
            } else {
                spannableStringBuilder.append((CharSequence) " ");
                xp e10 = e(tL_forumTopic);
                if (drawableArr != null) {
                    drawableArr[0] = e10.f40438a;
                }
                e10.setBounds(0, 0, (int) (e10.getIntrinsicWidth() * 0.65f), (int) (e10.getIntrinsicHeight() * 0.65f));
                Drawable drawable = e10.f40439b;
                if (drawable instanceof c70) {
                    ((c70) drawable).f32584i = 0.7f;
                }
                if (paint != null) {
                    wp wpVar = new wp(0, e10);
                    wpVar.c((int) (Math.abs(paint.getFontMetrics().ascent) + Math.abs(paint.getFontMetrics().descent)));
                    spannableStringBuilder.setSpan(wpVar, 0, 1, 33);
                } else {
                    spannableStringBuilder.setSpan(new ImageSpan(e10), 0, 1, 33);
                }
            }
            if (!TextUtils.isEmpty(tL_forumTopic.title)) {
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) tL_forumTopic.title);
            }
            return spannableStringBuilder;
        }
        return "DELETED";
    }

    public static boolean k(zi ziVar) {
        if (ziVar != null && (ziVar.f26868k.action instanceof TLRPC.TL_messageActionTopicCreate)) {
            return true;
        }
        return false;
    }

    public static ArrayList l(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            TLRPC.savedDialog saveddialog = (TLRPC.savedDialog) obj;
            if (saveddialog instanceof TLRPC.TL_monoForumDialog) {
                TLRPC.TL_monoForumDialog tL_monoForumDialog = (TLRPC.TL_monoForumDialog) saveddialog;
                long o10 = m5.o(tL_monoForumDialog.peer);
                TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                tL_forumTopic.f27053id = (int) ((o10 >>> 32) ^ o10);
                tL_forumTopic.title = Long.toString(o10);
                tL_forumTopic.top_message = tL_monoForumDialog.top_message;
                tL_forumTopic.read_inbox_max_id = tL_monoForumDialog.read_inbox_max_id;
                tL_forumTopic.read_outbox_max_id = tL_monoForumDialog.read_outbox_max_id;
                tL_forumTopic.unread_reactions_count = tL_monoForumDialog.unread_reactions_count;
                tL_forumTopic.unread_count = tL_monoForumDialog.unread_count;
                tL_forumTopic.draft = tL_monoForumDialog.draft;
                tL_forumTopic.notify_settings = new TLRPC.TL_peerNotifySettings();
                tL_forumTopic.from_id = tL_monoForumDialog.peer;
                tL_forumTopic.nopaid_messages_exception = tL_monoForumDialog.nopaid_messages_exception;
                arrayList2.add(tL_forumTopic);
            }
        }
        return arrayList2;
    }

    public static void m(d2 d2Var, long j10, TLRPC.TL_forumTopic tL_forumTopic, int i3) {
        wm g7 = g(d2Var, j10, tL_forumTopic, i3, new Bundle());
        if (g7 != null) {
            d2Var.presentFragment(g7);
        }
    }

    public static void n(int i3, TLRPC.Chat chat, u8 u8Var, ImageReceiver imageReceiver) {
        TLRPC.Chat chat2;
        if (t3.p0(chat)) {
            chat2 = hp.s1(i3).M0(Long.valueOf(chat.linked_monoforum_id));
        } else {
            chat2 = null;
        }
        if (chat2 != null) {
            chat = chat2;
        }
        u8Var.q(chat);
        imageReceiver.i0(chat2, u8Var, null);
    }

    public static void o(int i3, TLRPC.Chat chat, u8 u8Var, k9 k9Var) {
        TLObject tLObject;
        if (t3.p0(chat)) {
            tLObject = hp.s1(i3).M0(Long.valueOf(chat.linked_monoforum_id));
        } else {
            tLObject = null;
        }
        if (tLObject != null) {
            chat = tLObject;
        }
        u8Var.q(chat);
        k9Var.e(tLObject, u8Var);
    }

    public static void p(k9 k9Var, TLRPC.TL_forumTopic tL_forumTopic, boolean z10, boolean z11, e6 e6Var) {
        int i3;
        ColorFilter o02;
        if (tL_forumTopic != null && k9Var != null) {
            if (tL_forumTopic.f27053id == 1) {
                k9Var.setAnimatedEmojiDrawable(null);
                Context context = k9Var.getContext();
                int i10 = k6.f28216v8;
                b c2 = c(context, 0.75f, k6.w0(i10, e6Var), z11);
                k9Var.setImageDrawable(c2);
                if (c2 != null) {
                    r6.y(k9Var, c2, i10, e6Var, PorterDuff.Mode.MULTIPLY);
                }
            } else if (tL_forumTopic.icon_emoji_id != 0) {
                k9Var.setImageDrawable(null);
                g5 g5Var = k9Var.f35345e;
                if (g5Var == null || tL_forumTopic.icon_emoji_id != g5Var.h()) {
                    if (z11) {
                        i3 = 11;
                    } else {
                        i3 = 10;
                    }
                    g5 g5Var2 = new g5(i3, h10.f22829t0, tL_forumTopic.icon_emoji_id);
                    if (z10) {
                        o02 = new PorterDuffColorFilter(k6.x0(null, k6.A8, false), PorterDuff.Mode.SRC_IN);
                    } else {
                        o02 = k6.o0(e6Var);
                    }
                    g5Var2.setColorFilter(o02);
                    k9Var.setAnimatedEmojiDrawable(g5Var2);
                }
            } else {
                k9Var.setAnimatedEmojiDrawable(null);
                k9Var.setImageDrawable(e(tL_forumTopic));
            }
        }
    }

    public static void q(long j10, ActionBarLayout actionBarLayout) {
        d2 lastFragment = actionBarLayout.getLastFragment();
        if (lastFragment instanceof wm) {
            wm wmVar = (wm) lastFragment;
            if ((-wmVar.a()) == j10 && wmVar.getMessagesController().M0(Long.valueOf(j10)).forum && wmVar.getParentLayout() != null) {
                if (((ActionBarLayout) wmVar.getParentLayout()).i()) {
                    g0.i3(new l(wmVar, 1), 500L);
                } else {
                    m91.M0(wmVar);
                }
            }
        }
        if (lastFragment instanceof m91) {
            m91 m91Var = (m91) lastFragment;
            long j11 = m91Var.f47575a;
            if ((-(-j11)) == j10 && !m91Var.getMessagesController().M0(Long.valueOf(j10)).forum) {
                if (m91Var.getParentLayout() != null && ((ActionBarLayout) m91Var.getParentLayout()).i()) {
                    g0.i3(new u(m91Var, 1), 500L);
                    return;
                }
                m91Var.I = true;
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", j11);
                wm wmVar2 = new wm(bundle);
                wmVar2.Da = true;
                m91Var.presentFragment(wmVar2);
            }
        }
    }
}
