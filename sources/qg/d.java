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
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.ij;
import org.telegram.messenger.m5;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.t0;
import org.telegram.messenger.t10;
import org.telegram.messenger.t3;
import org.telegram.messenger.xr;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.g70;
import org.telegram.ui.Components.i5;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xp;
import org.telegram.ui.an;
import org.telegram.ui.v91;
public abstract class d {
    public static final int f54033a = 0;

    static {
        new SparseArray();
    }

    public static void a(an anVar, xr xrVar) {
        TLRPC.TL_forumTopic f10;
        if (xrVar.f26506b != 0 && (f10 = anVar.getMessagesController().f24862q7.f(-xrVar.f26505a, xrVar.f26506b)) != null) {
            if (xrVar.f26505a > 0) {
                if (t10.u(anVar.getMessagesController().a2(Long.valueOf(xrVar.f26505a)))) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new ij(anVar.getCurrentAccount(), f10.topicStartMessage, false, false));
                    anVar.Rb(arrayList, null, f10.f27004id, f10.read_inbox_max_id, f10.read_outbox_max_id, f10);
                    anVar.getMessagesController().J4(-xrVar.f26505a, xrVar.f26506b);
                    return;
                }
                return;
            }
            TLRPC.Chat M0 = anVar.getMessagesController().M0(Long.valueOf(-xrVar.f26505a));
            if (M0 == null) {
                return;
            }
            if (t3.p0(M0)) {
                if (t3.A(p10.f24459s0, M0, 24)) {
                    int i7 = f10.read_inbox_max_id;
                    int i10 = f10.read_outbox_max_id;
                    anVar.f44030y4 = i7;
                    anVar.f44042z4 = i10;
                    anVar.A4 = Math.max(1, i7);
                    anVar.f43940r4 = m5.o(f10.from_id);
                    anVar.dd();
                    anVar.vd(false);
                    anVar.Lc(false);
                }
            } else {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new ij(anVar.getCurrentAccount(), f10.topicStartMessage, false, false));
                anVar.Rb(arrayList2, M0, f10.f27004id, f10.read_inbox_max_id, f10.read_outbox_max_id, f10);
            }
            anVar.getMessagesController().J4(-xrVar.f26505a, xrVar.f26506b);
        }
    }

    public static void b(ij ijVar) {
        TLRPC.TL_forumTopic f10;
        TLRPC.Message message = ijVar.f23237k;
        int i7 = ijVar.I1;
        if (ij.B0(message) <= 0 && (f10 = qp.s1(i7).f24862q7.f(-ij.B0(ijVar.f23237k), ij.c2(i7, ijVar.f23237k, true, false))) != null) {
            Drawable drawable = ijVar.f23222g2[0];
            if (drawable instanceof a) {
                ((a) drawable).b(f10.icon_color);
            }
        }
    }

    public static c c(Context context, float f10, int i7, boolean z9) {
        int i10;
        if (context == null) {
            return null;
        }
        ?? drawable = new Drawable();
        Resources resources = context.getResources();
        if (z9) {
            i10 = 2131232145;
        } else {
            i10 = 2131232144;
        }
        drawable.f54030a = resources.getDrawable(i10).mutate();
        drawable.f54031b = f10;
        drawable.a(i7);
        return drawable;
    }

    public static xp d(int i7, String str) {
        String str2;
        a aVar = new a(i7);
        g70 g70Var = new g70(1, null);
        String trim = str.trim();
        if (trim.length() >= 1) {
            str2 = trim.substring(0, 1).toUpperCase();
        } else {
            str2 = "";
        }
        g70Var.a(str2);
        xp xpVar = new xp(aVar, g70Var, 0, 0);
        xpVar.f40324x = true;
        return xpVar;
    }

    public static xp e(TLRPC.TL_forumTopic tL_forumTopic) {
        if (tL_forumTopic == null) {
            return null;
        }
        return d(tL_forumTopic.icon_color, tL_forumTopic.title);
    }

    public static void f(ArrayList arrayList, long j3) {
        if (arrayList != null) {
            int i7 = 0;
            while (i7 < arrayList.size()) {
                if (j3 != ij.c2(((ij) arrayList.get(i7)).I1, ((ij) arrayList.get(i7)).f23237k, true, false)) {
                    arrayList.remove(i7);
                    i7--;
                }
                i7++;
            }
        }
    }

    public static an g(f2 f2Var, long j3, TLRPC.TL_forumTopic tL_forumTopic, int i7, Bundle bundle) {
        TLRPC.TL_forumTopic tL_forumTopic2;
        TLRPC.TL_forumTopic f10;
        if (f2Var != null && tL_forumTopic != null) {
            TLRPC.Chat M0 = f2Var.getMessagesController().M0(Long.valueOf(j3));
            bundle.putLong("chat_id", j3);
            if (i7 != 0) {
                bundle.putInt("message_id", i7);
            } else if (tL_forumTopic.read_inbox_max_id == 0) {
                bundle.putInt("message_id", tL_forumTopic.f27004id);
            }
            bundle.putInt("unread_count", tL_forumTopic.unread_count);
            bundle.putBoolean("historyPreloaded", false);
            an anVar = new an(bundle);
            TLRPC.Message message = tL_forumTopic.topicStartMessage;
            if (message == null && (f10 = f2Var.getMessagesController().f24862q7.f(j3, tL_forumTopic.f27004id)) != null) {
                message = f10.topicStartMessage;
                tL_forumTopic2 = f10;
            } else {
                tL_forumTopic2 = tL_forumTopic;
            }
            if (message != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new ij(f2Var.getCurrentAccount(), message, false, false));
                anVar.Rb(arrayList, M0, tL_forumTopic2.f27004id, tL_forumTopic2.read_inbox_max_id, tL_forumTopic2.read_outbox_max_id, tL_forumTopic2);
                if (i7 != 0) {
                    anVar.f43740b8 = i7;
                }
                return anVar;
            }
            return null;
        }
        return null;
    }

    public static String h(int i7, long j3) {
        return i(i7, qp.s1(i7).M0(Long.valueOf(-j3)), true);
    }

    public static String i(int i7, TLRPC.Chat chat, boolean z9) {
        if (t3.p0(chat)) {
            TLRPC.Chat M0 = qp.s1(i7).M0(Long.valueOf(chat.linked_monoforum_id));
            if (M0 != null) {
                String str = M0.title;
                if (z9) {
                    return str;
                }
                return hd.a0(null, null, 2131748345, str);
            }
        } else if (chat != null && chat.linked_monoforum_id != 0) {
            String str2 = chat.title;
            if (z9) {
                return str2;
            }
            return hd.a0(null, null, 2131748345, str2);
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
            if (tL_forumTopic.f27004id == 1) {
                try {
                    Context context = t0.f25555b;
                    if (paint == null) {
                        color = k6.x0(null, k6.f28055od, false);
                    } else {
                        color = paint.getColor();
                    }
                    c c10 = c(context, 1.0f, color, false);
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
                r5 r5Var = new r5(j3, 0.95f, fontMetricsInt);
                spannableStringBuilder.setSpan(r5Var, 0, 1, 33);
                r5Var.top = true;
                r5Var.cacheType = 13;
            } else {
                spannableStringBuilder.append((CharSequence) " ");
                xp e10 = e(tL_forumTopic);
                if (drawableArr != null) {
                    drawableArr[0] = e10.f40315a;
                }
                e10.setBounds(0, 0, (int) (e10.getIntrinsicWidth() * 0.65f), (int) (e10.getIntrinsicHeight() * 0.65f));
                Drawable drawable = e10.f40316b;
                if (drawable instanceof g70) {
                    ((g70) drawable).f33829i = 0.7f;
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

    public static boolean k(ij ijVar) {
        if (ijVar != null && (ijVar.f23237k.action instanceof TLRPC.TL_messageActionTopicCreate)) {
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
                tL_forumTopic.f27004id = (int) ((o4 >>> 32) ^ o4);
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

    public static void m(f2 f2Var, long j3, TLRPC.TL_forumTopic tL_forumTopic, int i7) {
        an g10 = g(f2Var, j3, tL_forumTopic, i7, new Bundle());
        if (g10 != null) {
            f2Var.presentFragment(g10);
        }
    }

    public static void n(int i7, TLRPC.Chat chat, w8 w8Var, ImageReceiver imageReceiver) {
        TLRPC.Chat chat2;
        if (t3.p0(chat)) {
            chat2 = qp.s1(i7).M0(Long.valueOf(chat.linked_monoforum_id));
        } else {
            chat2 = null;
        }
        if (chat2 != null) {
            chat = chat2;
        }
        w8Var.q(chat);
        imageReceiver.i0(chat2, w8Var, null);
    }

    public static void o(int i7, TLRPC.Chat chat, w8 w8Var, l9 l9Var) {
        TLObject tLObject;
        if (t3.p0(chat)) {
            tLObject = qp.s1(i7).M0(Long.valueOf(chat.linked_monoforum_id));
        } else {
            tLObject = null;
        }
        if (tLObject != null) {
            chat = tLObject;
        }
        w8Var.q(chat);
        l9Var.e(tLObject, w8Var);
    }

    public static void p(l9 l9Var, TLRPC.TL_forumTopic tL_forumTopic, boolean z9, boolean z10, f6 f6Var) {
        int i7;
        ColorFilter o02;
        if (tL_forumTopic != null && l9Var != null) {
            if (tL_forumTopic.f27004id == 1) {
                l9Var.setAnimatedEmojiDrawable(null);
                Context context = l9Var.getContext();
                int i10 = k6.f28185v8;
                c c10 = c(context, 0.75f, k6.w0(i10, f6Var), z10);
                l9Var.setImageDrawable(c10);
                if (c10 != null) {
                    r6.y(l9Var, c10, i10, f6Var, PorterDuff.Mode.MULTIPLY);
                }
            } else if (tL_forumTopic.icon_emoji_id != 0) {
                l9Var.setImageDrawable(null);
                i5 i5Var = l9Var.f35565e;
                if (i5Var == null || tL_forumTopic.icon_emoji_id != i5Var.h()) {
                    if (z10) {
                        i7 = 11;
                    } else {
                        i7 = 10;
                    }
                    i5 i5Var2 = new i5(i7, p10.f24459s0, tL_forumTopic.icon_emoji_id);
                    if (z9) {
                        o02 = new PorterDuffColorFilter(k6.x0(null, k6.A8, false), PorterDuff.Mode.SRC_IN);
                    } else {
                        o02 = k6.o0(f6Var);
                    }
                    i5Var2.setColorFilter(o02);
                    l9Var.setAnimatedEmojiDrawable(i5Var2);
                }
            } else {
                l9Var.setAnimatedEmojiDrawable(null);
                l9Var.setImageDrawable(e(tL_forumTopic));
            }
        }
    }

    public static void q(long j3, ActionBarLayout actionBarLayout) {
        f2 lastFragment = actionBarLayout.getLastFragment();
        if (lastFragment instanceof an) {
            an anVar = (an) lastFragment;
            if ((-anVar.a()) == j3 && anVar.getMessagesController().M0(Long.valueOf(j3)).forum && anVar.getParentLayout() != null) {
                if (((ActionBarLayout) anVar.getParentLayout()).i()) {
                    g0.i3(new b(anVar, 0), 500L);
                } else {
                    v91.M0(anVar);
                }
            }
        }
        if (lastFragment instanceof v91) {
            v91 v91Var = (v91) lastFragment;
            long j10 = v91Var.f50629a;
            if ((-(-j10)) == j3 && !v91Var.getMessagesController().M0(Long.valueOf(j3)).forum) {
                if (v91Var.getParentLayout() != null && ((ActionBarLayout) v91Var.getParentLayout()).i()) {
                    g0.i3(new org.telegram.ui.ActionBar.m5(v91Var, 22), 500L);
                    return;
                }
                v91Var.H = true;
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", j10);
                an anVar2 = new an(bundle);
                anVar2.Ca = true;
                v91Var.presentFragment(anVar2);
            }
        }
    }
}
