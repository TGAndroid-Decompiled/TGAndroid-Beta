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
import org.telegram.messenger.fj;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.i5;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.messenger.n5;
import org.telegram.messenger.o10;
import org.telegram.messenger.sr;
import org.telegram.messenger.t0;
import org.telegram.messenger.v3;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.q9;
import org.telegram.ui.Components.u70;
import org.telegram.ui.Components.x5;
import org.telegram.ui.bn;
import org.telegram.ui.web.z0;
import org.telegram.ui.y91;
public abstract class c {
    public static final int f56144a = 0;

    static {
        new SparseArray();
    }

    public static void a(bn bnVar, sr srVar) {
        TLRPC.TL_forumTopic f10;
        if (srVar.f26846b != 0 && (f10 = bnVar.getMessagesController().f25769t7.f(-srVar.f26845a, srVar.f26846b)) != null) {
            if (srVar.f26845a > 0) {
                if (o10.v(bnVar.getMessagesController().c2(Long.valueOf(srVar.f26845a)))) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new fj(bnVar.getCurrentAccount(), f10.topicStartMessage, false, false));
                    bnVar.Vb(arrayList, null, f10.f28455id, f10.read_inbox_max_id, f10.read_outbox_max_id, f10);
                    bnVar.getMessagesController().V4(-srVar.f26845a, srVar.f26846b);
                    return;
                }
                return;
            }
            TLRPC.Chat O0 = bnVar.getMessagesController().O0(Long.valueOf(-srVar.f26845a));
            if (O0 == null) {
                return;
            }
            if (v3.p0(O0)) {
                if (v3.A(j10.f24770t0, O0, 24)) {
                    int i7 = f10.read_inbox_max_id;
                    int i10 = f10.read_outbox_max_id;
                    bnVar.A4 = i7;
                    bnVar.B4 = i10;
                    bnVar.C4 = Math.max(1, i7);
                    bnVar.f46164s4 = n5.o(f10.from_id);
                    bnVar.hd();
                    bnVar.zd(false);
                    bnVar.Pc(false);
                }
            } else {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new fj(bnVar.getCurrentAccount(), f10.topicStartMessage, false, false));
                bnVar.Vb(arrayList2, O0, f10.f28455id, f10.read_inbox_max_id, f10.read_outbox_max_id, f10);
            }
            bnVar.getMessagesController().V4(-srVar.f26845a, srVar.f26846b);
        }
    }

    public static void b(fj fjVar) {
        TLRPC.TL_forumTopic f10;
        TLRPC.Message message = fjVar.f23965k;
        int i7 = fjVar.K1;
        if (fj.B0(message) <= 0 && (f10 = mp.u1(i7).f25769t7.f(-fj.B0(fjVar.f23965k), fj.b2(i7, fjVar.f23965k, true, false))) != null) {
            Drawable drawable = fjVar.f23959i2[0];
            if (drawable instanceof a) {
                ((a) drawable).b(f10.icon_color);
            }
        }
    }

    public static SpannableStringBuilder c(TLRPC.TL_forumTopic tL_forumTopic, fj fjVar) {
        TLRPC.Chat O0;
        TLRPC.User user;
        String str;
        int i7;
        int i10;
        if (tL_forumTopic != null) {
            TLRPC.Message message = fjVar.f23965k;
            int i11 = fjVar.K1;
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionTopicCreate) {
                return g0.K2(gd.M0(2131743764, null), k(tL_forumTopic, null, null), "%s");
            }
            if (messageAction instanceof TLRPC.TL_messageActionTopicEdit) {
                TLRPC.TL_messageActionTopicEdit tL_messageActionTopicEdit = (TLRPC.TL_messageActionTopicEdit) messageAction;
                long Z0 = fjVar.Z0();
                if (n5.E(Z0)) {
                    user = mp.u1(i11).c2(Long.valueOf(Z0));
                    O0 = null;
                } else {
                    O0 = mp.u1(i11).O0(Long.valueOf(-Z0));
                    user = null;
                }
                if (user != null) {
                    str = i5.m(0, user.first_name, user.last_name);
                } else if (O0 != null) {
                    str = O0.title;
                } else {
                    str = null;
                }
                int i12 = tL_messageActionTopicEdit.flags;
                if ((i12 & 8) != 0) {
                    if (tL_messageActionTopicEdit.hidden) {
                        i10 = 2131743782;
                    } else {
                        i10 = 2131743768;
                    }
                    return g0.K2(gd.M0(i10, null), str, "%s");
                } else if ((i12 & 4) != 0) {
                    if (tL_messageActionTopicEdit.closed) {
                        i7 = 2131743765;
                    } else {
                        i7 = 2131743760;
                    }
                    return g0.K2(g0.K2(gd.M0(i7, null), k(tL_forumTopic, null, null), "%2$s"), str, "%1$s");
                } else {
                    int i13 = i12 & 1;
                    if (i13 != 0 && (i12 & 2) != 0) {
                        TLRPC.TL_forumTopic tL_forumTopic2 = new TLRPC.TL_forumTopic();
                        tL_forumTopic2.icon_emoji_id = tL_messageActionTopicEdit.icon_emoji_id;
                        tL_forumTopic2.title = tL_messageActionTopicEdit.title;
                        return g0.K2(g0.K2(gd.M0(2131743761, null), k(tL_forumTopic2, null, null), "%2$s"), str, "%1$s");
                    } else if (i13 != 0) {
                        return g0.K2(g0.K2(gd.M0(2131743762, null), tL_messageActionTopicEdit.title, "%2$s"), str, "%1$s");
                    } else {
                        if ((i12 & 2) != 0) {
                            TLRPC.TL_forumTopic tL_forumTopic3 = new TLRPC.TL_forumTopic();
                            tL_forumTopic3.icon_emoji_id = tL_messageActionTopicEdit.icon_emoji_id;
                            tL_forumTopic3.title = "";
                            return g0.K2(g0.K2(gd.M0(2131743763, null), k(tL_forumTopic3, null, null), "%2$s"), str, "%1$s");
                        }
                    }
                }
            }
        }
        return null;
    }

    public static b d(Context context, float f10, int i7, boolean z10) {
        int i10;
        if (context == null) {
            return null;
        }
        ?? drawable = new Drawable();
        Resources resources = context.getResources();
        if (z10) {
            i10 = 2131232147;
        } else {
            i10 = 2131232146;
        }
        drawable.f56141a = resources.getDrawable(i10).mutate();
        drawable.f56142b = f10;
        drawable.a(i7);
        return drawable;
    }

    public static mq e(int i7, String str) {
        String str2;
        a aVar = new a(i7);
        u70 u70Var = new u70(1, null);
        String trim = str.trim();
        if (trim.length() >= 1) {
            str2 = trim.substring(0, 1).toUpperCase();
        } else {
            str2 = "";
        }
        u70Var.a(str2);
        mq mqVar = new mq(aVar, u70Var, 0, 0);
        mqVar.f37616x = true;
        return mqVar;
    }

    public static mq f(TLRPC.TL_forumTopic tL_forumTopic) {
        if (tL_forumTopic == null) {
            return null;
        }
        return e(tL_forumTopic.icon_color, tL_forumTopic.title);
    }

    public static void g(ArrayList arrayList, long j3) {
        if (arrayList != null) {
            int i7 = 0;
            while (i7 < arrayList.size()) {
                if (j3 != fj.b2(((fj) arrayList.get(i7)).K1, ((fj) arrayList.get(i7)).f23965k, true, false)) {
                    arrayList.remove(i7);
                    i7--;
                }
                i7++;
            }
        }
    }

    public static bn h(h2 h2Var, long j3, TLRPC.TL_forumTopic tL_forumTopic, int i7, Bundle bundle) {
        TLRPC.TL_forumTopic tL_forumTopic2;
        TLRPC.TL_forumTopic f10;
        if (h2Var != null && tL_forumTopic != null) {
            TLRPC.Chat O0 = h2Var.getMessagesController().O0(Long.valueOf(j3));
            bundle.putLong("chat_id", j3);
            if (i7 != 0) {
                bundle.putInt("message_id", i7);
            } else if (tL_forumTopic.read_inbox_max_id == 0) {
                bundle.putInt("message_id", tL_forumTopic.f28455id);
            }
            bundle.putInt("unread_count", tL_forumTopic.unread_count);
            bundle.putBoolean("historyPreloaded", false);
            bn bnVar = new bn(bundle);
            TLRPC.Message message = tL_forumTopic.topicStartMessage;
            if (message == null && (f10 = h2Var.getMessagesController().f25769t7.f(j3, tL_forumTopic.f28455id)) != null) {
                message = f10.topicStartMessage;
                tL_forumTopic2 = f10;
            } else {
                tL_forumTopic2 = tL_forumTopic;
            }
            if (message != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new fj(h2Var.getCurrentAccount(), message, false, false));
                bnVar.Vb(arrayList, O0, tL_forumTopic2.f28455id, tL_forumTopic2.read_inbox_max_id, tL_forumTopic2.read_outbox_max_id, tL_forumTopic2);
                if (i7 != 0) {
                    bnVar.f45973d8 = i7;
                }
                return bnVar;
            }
            return null;
        }
        return null;
    }

    public static String i(int i7, long j3) {
        return j(i7, mp.u1(i7).O0(Long.valueOf(-j3)), true);
    }

    public static String j(int i7, TLRPC.Chat chat, boolean z10) {
        if (v3.p0(chat)) {
            TLRPC.Chat O0 = mp.u1(i7).O0(Long.valueOf(chat.linked_monoforum_id));
            if (O0 != null) {
                String str = O0.title;
                if (z10) {
                    return str;
                }
                return gd.a0(null, null, 2131748154, str);
            }
        } else if (chat != null && chat.linked_monoforum_id != 0) {
            String str2 = chat.title;
            if (z10) {
                return str2;
            }
            return gd.a0(null, null, 2131748154, str2);
        }
        if (chat == null) {
            return null;
        }
        return chat.title;
    }

    public static CharSequence k(TLRPC.ForumTopic forumTopic, Paint paint, Drawable[] drawableArr) {
        int color;
        int textSize;
        int textSize2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (forumTopic instanceof TLRPC.TL_forumTopic) {
            TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) forumTopic;
            Paint.FontMetricsInt fontMetricsInt = null;
            if (tL_forumTopic.f28455id == 1) {
                try {
                    Context context = t0.f26913b;
                    if (paint == null) {
                        color = n6.x0(null, n6.f29660rd, false);
                    } else {
                        color = paint.getColor();
                    }
                    b d = d(context, 1.0f, color, false);
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
                    d.setBounds(0, 0, textSize, textSize2);
                    spannableStringBuilder.append((CharSequence) " ");
                    if (drawableArr != null) {
                        drawableArr[0] = d;
                    }
                    spannableStringBuilder.setSpan(new ImageSpan(d, 2), 0, 1, 33);
                } catch (Exception unused) {
                }
            } else if (tL_forumTopic.icon_emoji_id != 0) {
                spannableStringBuilder.append((CharSequence) " ");
                long j3 = tL_forumTopic.icon_emoji_id;
                if (paint != null) {
                    fontMetricsInt = paint.getFontMetricsInt();
                }
                x5 x5Var = new x5(j3, 0.95f, fontMetricsInt);
                spannableStringBuilder.setSpan(x5Var, 0, 1, 33);
                x5Var.top = true;
                x5Var.cacheType = 13;
            } else {
                spannableStringBuilder.append((CharSequence) " ");
                mq f10 = f(tL_forumTopic);
                if (drawableArr != null) {
                    drawableArr[0] = f10.f37607a;
                }
                f10.setBounds(0, 0, (int) (f10.getIntrinsicWidth() * 0.65f), (int) (f10.getIntrinsicHeight() * 0.65f));
                Drawable drawable = f10.f37608b;
                if (drawable instanceof u70) {
                    ((u70) drawable).f40247i = 0.7f;
                }
                if (paint != null) {
                    lq lqVar = new lq(0, f10);
                    lqVar.c((int) (Math.abs(paint.getFontMetrics().ascent) + Math.abs(paint.getFontMetrics().descent)));
                    spannableStringBuilder.setSpan(lqVar, 0, 1, 33);
                } else {
                    spannableStringBuilder.setSpan(new ImageSpan(f10), 0, 1, 33);
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

    public static boolean l(fj fjVar) {
        if (fjVar != null && (fjVar.f23965k.action instanceof TLRPC.TL_messageActionTopicCreate)) {
            return true;
        }
        return false;
    }

    public static ArrayList m(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            TLRPC.savedDialog saveddialog = (TLRPC.savedDialog) obj;
            if (saveddialog instanceof TLRPC.TL_monoForumDialog) {
                TLRPC.TL_monoForumDialog tL_monoForumDialog = (TLRPC.TL_monoForumDialog) saveddialog;
                long o4 = n5.o(tL_monoForumDialog.peer);
                TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                tL_forumTopic.f28455id = (int) ((o4 >>> 32) ^ o4);
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

    public static void n(h2 h2Var, long j3, TLRPC.TL_forumTopic tL_forumTopic, int i7) {
        bn h = h(h2Var, j3, tL_forumTopic, i7, new Bundle());
        if (h != null) {
            h2Var.presentFragment(h);
        }
    }

    public static void o(int i7, TLRPC.Chat chat, b9 b9Var, ImageReceiver imageReceiver) {
        TLRPC.Chat chat2;
        if (v3.p0(chat)) {
            chat2 = mp.u1(i7).O0(Long.valueOf(chat.linked_monoforum_id));
        } else {
            chat2 = null;
        }
        if (chat2 != null) {
            chat = chat2;
        }
        b9Var.q(chat);
        imageReceiver.i0(chat2, b9Var, null);
    }

    public static void p(int i7, TLRPC.Chat chat, b9 b9Var, q9 q9Var) {
        TLObject tLObject;
        if (v3.p0(chat)) {
            tLObject = mp.u1(i7).O0(Long.valueOf(chat.linked_monoforum_id));
        } else {
            tLObject = null;
        }
        if (tLObject != null) {
            chat = tLObject;
        }
        b9Var.q(chat);
        q9Var.f(tLObject, b9Var);
    }

    public static void q(q9 q9Var, TLRPC.TL_forumTopic tL_forumTopic, boolean z10, boolean z11, i6 i6Var) {
        int i7;
        ColorFilter o02;
        if (tL_forumTopic != null && q9Var != null) {
            if (tL_forumTopic.f28455id == 1) {
                q9Var.setAnimatedEmojiDrawable(null);
                Context context = q9Var.getContext();
                int i10 = n6.f29731v8;
                b d = d(context, 0.75f, n6.w0(i10, i6Var), z11);
                q9Var.setImageDrawable(d);
                if (d != null) {
                    u6.x(q9Var, d, i10, i6Var, PorterDuff.Mode.MULTIPLY);
                }
            } else if (tL_forumTopic.icon_emoji_id != 0) {
                q9Var.setImageDrawable(null);
                o5 o5Var = q9Var.f38745e;
                if (o5Var == null || tL_forumTopic.icon_emoji_id != o5Var.h()) {
                    if (z11) {
                        i7 = 11;
                    } else {
                        i7 = 10;
                    }
                    o5 o5Var2 = new o5(i7, j10.f24770t0, tL_forumTopic.icon_emoji_id);
                    if (z10) {
                        o02 = new PorterDuffColorFilter(n6.x0(null, n6.A8, false), PorterDuff.Mode.SRC_IN);
                    } else {
                        o02 = n6.o0(i6Var);
                    }
                    o5Var2.setColorFilter(o02);
                    q9Var.setAnimatedEmojiDrawable(o5Var2);
                }
            } else {
                q9Var.setAnimatedEmojiDrawable(null);
                q9Var.setImageDrawable(f(tL_forumTopic));
            }
        }
    }

    public static void r(long j3, ActionBarLayout actionBarLayout) {
        h2 lastFragment = actionBarLayout.getLastFragment();
        if (lastFragment instanceof bn) {
            bn bnVar = (bn) lastFragment;
            if ((-bnVar.a()) == j3 && bnVar.getMessagesController().O0(Long.valueOf(j3)).forum && bnVar.getParentLayout() != null) {
                if (((ActionBarLayout) bnVar.getParentLayout()).i()) {
                    g0.h3(new i(bnVar, 1), 500L);
                } else {
                    y91.M0(bnVar);
                }
            }
        }
        if (lastFragment instanceof y91) {
            y91 y91Var = (y91) lastFragment;
            long j10 = y91Var.f54050a;
            if ((-(-j10)) == j3 && !y91Var.getMessagesController().O0(Long.valueOf(j3)).forum) {
                if (y91Var.getParentLayout() != null && ((ActionBarLayout) y91Var.getParentLayout()).i()) {
                    g0.h3(new z0(y91Var, 5), 500L);
                    return;
                }
                y91Var.I = true;
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", j10);
                bn bnVar2 = new bn(bundle);
                bnVar2.Ga = true;
                y91Var.presentFragment(bnVar2);
            }
        }
    }
}
