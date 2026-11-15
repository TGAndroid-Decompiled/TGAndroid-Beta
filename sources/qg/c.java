package qg;

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
import bi.i;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.g0;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.m5;
import org.telegram.messenger.np;
import org.telegram.messenger.q10;
import org.telegram.messenger.t0;
import org.telegram.messenger.t3;
import org.telegram.messenger.ur;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.t8;
import org.telegram.ui.an;
import org.telegram.ui.u91;
import q2.d;
public abstract class c {
    public static final int f55570a = 0;

    static {
        new SparseArray();
    }

    public static void a(an anVar, ur urVar) {
        TLRPC.TL_forumTopic f10;
        if (urVar.f26862b != 0 && (f10 = anVar.getMessagesController().f25386r7.f(-urVar.f26861a, urVar.f26862b)) != null) {
            if (urVar.f26861a > 0) {
                if (q10.u(anVar.getMessagesController().a2(Long.valueOf(urVar.f26861a)))) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new gj(anVar.getCurrentAccount(), f10.topicStartMessage, false, false));
                    anVar.Vb(arrayList, null, f10.f28103id, f10.read_inbox_max_id, f10.read_outbox_max_id, f10);
                    anVar.getMessagesController().K4(-urVar.f26861a, urVar.f26862b);
                    return;
                }
                return;
            }
            TLRPC.Chat M0 = anVar.getMessagesController().M0(Long.valueOf(-urVar.f26861a));
            if (M0 == null) {
                return;
            }
            if (t3.p0(M0)) {
                if (t3.A(m10.f24940t0, M0, 24)) {
                    int i7 = f10.read_inbox_max_id;
                    int i10 = f10.read_outbox_max_id;
                    anVar.f45445z4 = i7;
                    anVar.A4 = i10;
                    anVar.B4 = Math.max(1, i7);
                    anVar.f45357s4 = m5.o(f10.from_id);
                    anVar.hd();
                    anVar.zd(false);
                    anVar.Pc(false);
                }
            } else {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new gj(anVar.getCurrentAccount(), f10.topicStartMessage, false, false));
                anVar.Vb(arrayList2, M0, f10.f28103id, f10.read_inbox_max_id, f10.read_outbox_max_id, f10);
            }
            anVar.getMessagesController().K4(-urVar.f26861a, urVar.f26862b);
        }
    }

    public static void b(gj gjVar) {
        TLRPC.TL_forumTopic f10;
        TLRPC.Message message = gjVar.f23819k;
        int i7 = gjVar.K1;
        if (gj.B0(message) <= 0 && (f10 = np.s1(i7).f25386r7.f(-gj.B0(gjVar.f23819k), gj.b2(i7, gjVar.f23819k, true, false))) != null) {
            Drawable drawable = gjVar.f23813i2[0];
            if (drawable instanceof a) {
                ((a) drawable).b(f10.icon_color);
            }
        }
    }

    public static b c(Context context, float f10, int i7, boolean z10) {
        int i10;
        if (context == null) {
            return null;
        }
        ?? drawable = new Drawable();
        Resources resources = context.getResources();
        if (z10) {
            i10 = 2131232146;
        } else {
            i10 = 2131232145;
        }
        drawable.f55567a = resources.getDrawable(i10).mutate();
        drawable.f55568b = f10;
        drawable.a(i7);
        return drawable;
    }

    public static fq d(int i7, String str) {
        String str2;
        a aVar = new a(i7);
        j70 j70Var = new j70(1, null);
        String trim = str.trim();
        if (trim.length() >= 1) {
            str2 = trim.substring(0, 1).toUpperCase();
        } else {
            str2 = "";
        }
        j70Var.a(str2);
        fq fqVar = new fq(aVar, j70Var, 0, 0);
        fqVar.f34682x = true;
        return fqVar;
    }

    public static fq e(TLRPC.TL_forumTopic tL_forumTopic) {
        if (tL_forumTopic == null) {
            return null;
        }
        return d(tL_forumTopic.icon_color, tL_forumTopic.title);
    }

    public static void f(ArrayList arrayList, long j3) {
        if (arrayList != null) {
            int i7 = 0;
            while (i7 < arrayList.size()) {
                if (j3 != gj.b2(((gj) arrayList.get(i7)).K1, ((gj) arrayList.get(i7)).f23819k, true, false)) {
                    arrayList.remove(i7);
                    i7--;
                }
                i7++;
            }
        }
    }

    public static an g(e2 e2Var, long j3, TLRPC.TL_forumTopic tL_forumTopic, int i7, Bundle bundle) {
        TLRPC.TL_forumTopic tL_forumTopic2;
        TLRPC.TL_forumTopic f10;
        if (e2Var != null && tL_forumTopic != null) {
            TLRPC.Chat M0 = e2Var.getMessagesController().M0(Long.valueOf(j3));
            bundle.putLong("chat_id", j3);
            if (i7 != 0) {
                bundle.putInt("message_id", i7);
            } else if (tL_forumTopic.read_inbox_max_id == 0) {
                bundle.putInt("message_id", tL_forumTopic.f28103id);
            }
            bundle.putInt("unread_count", tL_forumTopic.unread_count);
            bundle.putBoolean("historyPreloaded", false);
            an anVar = new an(bundle);
            TLRPC.Message message = tL_forumTopic.topicStartMessage;
            if (message == null && (f10 = e2Var.getMessagesController().f25386r7.f(j3, tL_forumTopic.f28103id)) != null) {
                message = f10.topicStartMessage;
                tL_forumTopic2 = f10;
            } else {
                tL_forumTopic2 = tL_forumTopic;
            }
            if (message != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new gj(e2Var.getCurrentAccount(), message, false, false));
                anVar.Vb(arrayList, M0, tL_forumTopic2.f28103id, tL_forumTopic2.read_inbox_max_id, tL_forumTopic2.read_outbox_max_id, tL_forumTopic2);
                if (i7 != 0) {
                    anVar.f45154c8 = i7;
                }
                return anVar;
            }
            return null;
        }
        return null;
    }

    public static String h(int i7, long j3) {
        return i(i7, np.s1(i7).M0(Long.valueOf(-j3)), true);
    }

    public static String i(int i7, TLRPC.Chat chat, boolean z10) {
        if (t3.p0(chat)) {
            TLRPC.Chat M0 = np.s1(i7).M0(Long.valueOf(chat.linked_monoforum_id));
            if (M0 != null) {
                String str = M0.title;
                if (z10) {
                    return str;
                }
                return hd.a0(null, null, 2131748346, str);
            }
        } else if (chat != null && chat.linked_monoforum_id != 0) {
            String str2 = chat.title;
            if (z10) {
                return str2;
            }
            return hd.a0(null, null, 2131748346, str2);
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
            if (tL_forumTopic.f28103id == 1) {
                try {
                    Context context = t0.f26609b;
                    if (paint == null) {
                        color = j6.x0(null, j6.f29115rd, false);
                    } else {
                        color = paint.getColor();
                    }
                    b c10 = c(context, 1.0f, color, false);
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
                    c10.setBounds(0, 0, textSize, textSize2);
                    spannableStringBuilder.append((CharSequence) " ");
                    if (drawableArr != null) {
                        drawableArr[0] = c10;
                    }
                    spannableStringBuilder.setSpan(new ImageSpan(c10, 2), 0, 1, 33);
                } catch (Exception unused) {
                }
            } else if (tL_forumTopic.icon_emoji_id != 0) {
                spannableStringBuilder.append((CharSequence) " ");
                long j3 = tL_forumTopic.icon_emoji_id;
                if (paint != null) {
                    fontMetricsInt = paint.getFontMetricsInt();
                }
                p5 p5Var = new p5(j3, 0.95f, fontMetricsInt);
                spannableStringBuilder.setSpan(p5Var, 0, 1, 33);
                p5Var.top = true;
                p5Var.cacheType = 13;
            } else {
                spannableStringBuilder.append((CharSequence) " ");
                fq e10 = e(tL_forumTopic);
                if (drawableArr != null) {
                    drawableArr[0] = e10.f34673a;
                }
                e10.setBounds(0, 0, (int) (e10.getIntrinsicWidth() * 0.65f), (int) (e10.getIntrinsicHeight() * 0.65f));
                Drawable drawable = e10.f34674b;
                if (drawable instanceof j70) {
                    ((j70) drawable).f35897i = 0.7f;
                }
                if (paint != null) {
                    eq eqVar = new eq(0, e10);
                    eqVar.c((int) (Math.abs(paint.getFontMetrics().ascent) + Math.abs(paint.getFontMetrics().descent)));
                    spannableStringBuilder.setSpan(eqVar, 0, 1, 33);
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

    public static boolean k(gj gjVar) {
        if (gjVar != null && (gjVar.f23819k.action instanceof TLRPC.TL_messageActionTopicCreate)) {
            return true;
        }
        return false;
    }

    public static ArrayList l(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            TLRPC.savedDialog saveddialog = (TLRPC.savedDialog) obj;
            if (saveddialog instanceof TLRPC.TL_monoForumDialog) {
                TLRPC.TL_monoForumDialog tL_monoForumDialog = (TLRPC.TL_monoForumDialog) saveddialog;
                long o4 = m5.o(tL_monoForumDialog.peer);
                TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                tL_forumTopic.f28103id = (int) ((o4 >>> 32) ^ o4);
                tL_forumTopic.title = Long.toString(o4);
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

    public static void m(e2 e2Var, long j3, TLRPC.TL_forumTopic tL_forumTopic, int i7) {
        an g10 = g(e2Var, j3, tL_forumTopic, i7, new Bundle());
        if (g10 != null) {
            e2Var.presentFragment(g10);
        }
    }

    public static void n(int i7, TLRPC.Chat chat, t8 t8Var, ImageReceiver imageReceiver) {
        TLRPC.Chat chat2;
        if (t3.p0(chat)) {
            chat2 = np.s1(i7).M0(Long.valueOf(chat.linked_monoforum_id));
        } else {
            chat2 = null;
        }
        if (chat2 != null) {
            chat = chat2;
        }
        t8Var.q(chat);
        imageReceiver.i0(chat2, t8Var, null);
    }

    public static void o(int i7, TLRPC.Chat chat, t8 t8Var, i9 i9Var) {
        TLObject tLObject;
        if (t3.p0(chat)) {
            tLObject = np.s1(i7).M0(Long.valueOf(chat.linked_monoforum_id));
        } else {
            tLObject = null;
        }
        if (tLObject != null) {
            chat = tLObject;
        }
        t8Var.q(chat);
        i9Var.f(tLObject, t8Var);
    }

    public static void p(i9 i9Var, TLRPC.TL_forumTopic tL_forumTopic, boolean z10, boolean z11, e6 e6Var) {
        int i7;
        ColorFilter o02;
        if (tL_forumTopic != null && i9Var != null) {
            if (tL_forumTopic.f28103id == 1) {
                i9Var.setAnimatedEmojiDrawable(null);
                Context context = i9Var.getContext();
                int i10 = j6.f29186v8;
                b c10 = c(context, 0.75f, j6.w0(i10, e6Var), z11);
                i9Var.setImageDrawable(c10);
                if (c10 != null) {
                    q6.x(i9Var, c10, i10, e6Var, PorterDuff.Mode.MULTIPLY);
                }
            } else if (tL_forumTopic.icon_emoji_id != 0) {
                i9Var.setImageDrawable(null);
                g5 g5Var = i9Var.f35502e;
                if (g5Var == null || tL_forumTopic.icon_emoji_id != g5Var.h()) {
                    if (z11) {
                        i7 = 11;
                    } else {
                        i7 = 10;
                    }
                    g5 g5Var2 = new g5(i7, m10.f24940t0, tL_forumTopic.icon_emoji_id);
                    if (z10) {
                        o02 = new PorterDuffColorFilter(j6.x0(null, j6.A8, false), PorterDuff.Mode.SRC_IN);
                    } else {
                        o02 = j6.o0(e6Var);
                    }
                    g5Var2.setColorFilter(o02);
                    i9Var.setAnimatedEmojiDrawable(g5Var2);
                }
            } else {
                i9Var.setAnimatedEmojiDrawable(null);
                i9Var.setImageDrawable(e(tL_forumTopic));
            }
        }
    }

    public static void q(long j3, ActionBarLayout actionBarLayout) {
        e2 lastFragment = actionBarLayout.getLastFragment();
        if (lastFragment instanceof an) {
            an anVar = (an) lastFragment;
            if ((-anVar.a()) == j3 && anVar.getMessagesController().M0(Long.valueOf(j3)).forum && anVar.getParentLayout() != null) {
                if (((ActionBarLayout) anVar.getParentLayout()).i()) {
                    g0.i3(new i(anVar, 1), 500L);
                } else {
                    u91.M0(anVar);
                }
            }
        }
        if (lastFragment instanceof u91) {
            u91 u91Var = (u91) lastFragment;
            long j10 = u91Var.f51835a;
            if ((-(-j10)) == j3 && !u91Var.getMessagesController().M0(Long.valueOf(j3)).forum) {
                if (u91Var.getParentLayout() != null && ((ActionBarLayout) u91Var.getParentLayout()).i()) {
                    g0.i3(new d(u91Var, 2), 500L);
                    return;
                }
                u91Var.I = true;
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", j10);
                an anVar2 = new an(bundle);
                anVar2.Fa = true;
                u91Var.presentFragment(anVar2);
            }
        }
    }
}
