package zg;

import android.text.TextUtils;
import j$.util.Objects;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.q5;
public final class m0 {
    public boolean f53467a;
    public boolean f53468b;
    public long f53469c;
    public boolean d;
    public boolean f53470e;
    public String f53471f;
    public long f53472g;
    public long h;

    public static m0 b(String str) {
        if (str == null) {
            str = "";
        }
        ?? obj = new Object();
        if (str.startsWith("animated_")) {
            try {
                long parseLong = Long.parseLong(str.substring(9));
                obj.f53472g = parseLong;
                obj.h = parseLong;
                return obj;
            } catch (Exception unused) {
                obj.f53471f = str;
                obj.h = str.hashCode();
                return obj;
            }
        }
        obj.f53471f = str;
        obj.h = str.hashCode();
        return obj;
    }

    public static m0 c(TLRPC.TL_availableReaction tL_availableReaction) {
        ?? obj = new Object();
        String str = tL_availableReaction.reaction;
        obj.f53471f = str;
        obj.h = str.hashCode();
        return obj;
    }

    public static m0 d(TLRPC.Reaction reaction) {
        ?? obj = new Object();
        if (reaction instanceof TLRPC.TL_reactionPaid) {
            obj.f53467a = true;
            return obj;
        } else if (reaction instanceof TLRPC.TL_reactionEmoji) {
            String str = ((TLRPC.TL_reactionEmoji) reaction).emoticon;
            obj.f53471f = str;
            obj.h = str.hashCode();
            return obj;
        } else {
            if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
                long j3 = ((TLRPC.TL_reactionCustomEmoji) reaction).document_id;
                obj.f53472g = j3;
                obj.h = j3;
            }
            return obj;
        }
    }

    public static m0 e(TLRPC.TL_availableEffect tL_availableEffect) {
        ?? obj = new Object();
        boolean z10 = true;
        obj.f53468b = true;
        long j3 = tL_availableEffect.f20078id;
        obj.f53469c = j3;
        if (tL_availableEffect.effect_animation_id != 0) {
            z10 = false;
        }
        obj.f53470e = z10;
        obj.f53472g = tL_availableEffect.effect_sticker_id;
        obj.h = j3;
        obj.d = tL_availableEffect.premium_required;
        obj.f53471f = tL_availableEffect.emoticon;
        return obj;
    }

    public final m0 a() {
        String findAnimatedEmojiEmoticon;
        long j3 = this.f53472g;
        if (j3 != 0 && (findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(q5.f(UserConfig.selectedAccount, j3), null)) != null) {
            return b(findAnimatedEmojiEmoticon);
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m0.class == obj.getClass()) {
            m0 m0Var = (m0) obj;
            if (this.f53472g == m0Var.f53472g && Objects.equals(this.f53471f, m0Var.f53471f)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(TLRPC.Reaction reaction) {
        if (reaction instanceof TLRPC.TL_reactionEmoji) {
            return TextUtils.equals(((TLRPC.TL_reactionEmoji) reaction).emoticon, this.f53471f);
        }
        if (!(reaction instanceof TLRPC.TL_reactionCustomEmoji) || ((TLRPC.TL_reactionCustomEmoji) reaction).document_id != this.f53472g) {
            return false;
        }
        return true;
    }

    public final TLRPC.Reaction g() {
        if (this.f53467a) {
            return new TLRPC.TL_reactionPaid();
        }
        if (this.f53471f != null) {
            TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
            tL_reactionEmoji.emoticon = this.f53471f;
            return tL_reactionEmoji;
        }
        TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = new TLRPC.TL_reactionCustomEmoji();
        tL_reactionCustomEmoji.document_id = this.f53472g;
        return tL_reactionCustomEmoji;
    }

    public final int hashCode() {
        return Objects.hash(this.f53471f, Long.valueOf(this.f53472g));
    }

    public final String toString() {
        TLRPC.Document f7;
        if (!TextUtils.isEmpty(this.f53471f)) {
            return this.f53471f;
        }
        long j3 = this.f53472g;
        if (j3 != 0 && (f7 = q5.f(UserConfig.selectedAccount, j3)) != null) {
            return MessageObject.findAnimatedEmojiEmoticon(f7, null);
        }
        StringBuilder sb2 = new StringBuilder("VisibleReaction{");
        sb2.append(this.f53472g);
        sb2.append(", ");
        return a4.a.t(sb2, this.f53471f, "}");
    }
}
