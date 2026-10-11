package zg;

import android.text.TextUtils;
import j$.util.Objects;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.s5;
public final class n0 {
    public boolean f54734a;
    public boolean f54735b;
    public long f54736c;
    public boolean d;
    public boolean f54737e;
    public String f54738f;
    public long f54739g;
    public long h;

    public static n0 b(String str) {
        if (str == null) {
            str = "";
        }
        ?? obj = new Object();
        if (str.startsWith("animated_")) {
            try {
                long parseLong = Long.parseLong(str.substring(9));
                obj.f54739g = parseLong;
                obj.h = parseLong;
                return obj;
            } catch (Exception unused) {
                obj.f54738f = str;
                obj.h = str.hashCode();
                return obj;
            }
        }
        obj.f54738f = str;
        obj.h = str.hashCode();
        return obj;
    }

    public static n0 c(TLRPC.TL_availableReaction tL_availableReaction) {
        ?? obj = new Object();
        String str = tL_availableReaction.reaction;
        obj.f54738f = str;
        obj.h = str.hashCode();
        return obj;
    }

    public static n0 d(TLRPC.Reaction reaction) {
        ?? obj = new Object();
        if (reaction instanceof TLRPC.TL_reactionPaid) {
            obj.f54734a = true;
            return obj;
        } else if (reaction instanceof TLRPC.TL_reactionEmoji) {
            String str = ((TLRPC.TL_reactionEmoji) reaction).emoticon;
            obj.f54738f = str;
            obj.h = str.hashCode();
            return obj;
        } else {
            if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
                long j3 = ((TLRPC.TL_reactionCustomEmoji) reaction).document_id;
                obj.f54739g = j3;
                obj.h = j3;
            }
            return obj;
        }
    }

    public static n0 e(TLRPC.TL_availableEffect tL_availableEffect) {
        ?? obj = new Object();
        boolean z10 = true;
        obj.f54735b = true;
        long j3 = tL_availableEffect.f20099id;
        obj.f54736c = j3;
        if (tL_availableEffect.effect_animation_id != 0) {
            z10 = false;
        }
        obj.f54737e = z10;
        obj.f54739g = tL_availableEffect.effect_sticker_id;
        obj.h = j3;
        obj.d = tL_availableEffect.premium_required;
        obj.f54738f = tL_availableEffect.emoticon;
        return obj;
    }

    public final n0 a() {
        String findAnimatedEmojiEmoticon;
        long j3 = this.f54739g;
        if (j3 != 0 && (findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(s5.f(UserConfig.selectedAccount, j3), null)) != null) {
            return b(findAnimatedEmojiEmoticon);
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n0.class == obj.getClass()) {
            n0 n0Var = (n0) obj;
            if (this.f54739g == n0Var.f54739g && Objects.equals(this.f54738f, n0Var.f54738f)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(TLRPC.Reaction reaction) {
        if (reaction instanceof TLRPC.TL_reactionEmoji) {
            return TextUtils.equals(((TLRPC.TL_reactionEmoji) reaction).emoticon, this.f54738f);
        }
        if (!(reaction instanceof TLRPC.TL_reactionCustomEmoji) || ((TLRPC.TL_reactionCustomEmoji) reaction).document_id != this.f54739g) {
            return false;
        }
        return true;
    }

    public final TLRPC.Reaction g() {
        if (this.f54734a) {
            return new TLRPC.TL_reactionPaid();
        }
        if (this.f54738f != null) {
            TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
            tL_reactionEmoji.emoticon = this.f54738f;
            return tL_reactionEmoji;
        }
        TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = new TLRPC.TL_reactionCustomEmoji();
        tL_reactionCustomEmoji.document_id = this.f54739g;
        return tL_reactionCustomEmoji;
    }

    public final int hashCode() {
        return Objects.hash(this.f54738f, Long.valueOf(this.f54739g));
    }

    public final String toString() {
        TLRPC.Document f7;
        if (!TextUtils.isEmpty(this.f54738f)) {
            return this.f54738f;
        }
        long j3 = this.f54739g;
        if (j3 != 0 && (f7 = s5.f(UserConfig.selectedAccount, j3)) != null) {
            return MessageObject.findAnimatedEmojiEmoticon(f7, null);
        }
        StringBuilder sb2 = new StringBuilder("VisibleReaction{");
        sb2.append(this.f54739g);
        sb2.append(", ");
        return a1.g.t(sb2, this.f54738f, "}");
    }
}
