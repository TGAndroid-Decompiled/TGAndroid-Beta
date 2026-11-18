package org.telegram.ui;

import android.graphics.Typeface;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class rm {
    public org.telegram.messenger.fj f51640a;
    public int f51641b;
    public int f51642c;
    public byte[] f51643e;
    public boolean f51644f;
    public boolean h;
    public String f51646i;
    public ArrayList f51647j;
    public TLRPC.TodoItem f51648k;
    public TLRPC.PollAnswer f51649l;
    public boolean f51650m;
    public ArrayList f51651n;
    public int f51652o;
    public boolean f51645g = false;
    public int d = -1;

    public rm(int i7, int i10, org.telegram.messenger.fj fjVar) {
        TLRPC.Message message;
        this.f51640a = fjVar;
        this.f51641b = i7;
        this.f51642c = i10;
        boolean z10 = false;
        if (fjVar != null && (message = fjVar.f23965k) != null && message.rich_message != null) {
            z10 = true;
        }
        this.f51650m = z10;
        f();
    }

    public static rm b(int i7, int i10, org.telegram.messenger.fj fjVar) {
        if (fjVar == null) {
            return null;
        }
        org.telegram.messenger.fj.B0(fjVar.f23965k);
        return new rm(i7, i10, fjVar);
    }

    public static rm c(org.telegram.messenger.fj fjVar) {
        TLRPC.Message message = fjVar.f23965k;
        if (message != null) {
            if (message.message != null || (message != null && message.rich_message != null)) {
                return b(0, Math.min(org.telegram.messenger.mp.u1(fjVar.K1).f25749r4, d(fjVar)), fjVar);
            }
            return null;
        }
        return null;
    }

    public static int d(org.telegram.messenger.fj fjVar) {
        ?? r22;
        TLRPC.Message message = fjVar.f23965k;
        if (message != null) {
            if (message != null && message.rich_message != null) {
                org.telegram.messenger.ev evVar = fjVar.f24022y2;
                if (evVar != null && (r22 = evVar.f23781q) != 0) {
                    return r22.length();
                }
                return 0;
            }
            String str = message.message;
            if (str == null) {
                return 0;
            }
            return str.length();
        }
        return 0;
    }

    public final void a(org.telegram.messenger.fj fjVar) {
        String str;
        int i7;
        int i10;
        TL_iv.RichMessage richMessage;
        org.telegram.messenger.iv ivVar;
        int[] iArr;
        if (this.f51650m) {
            TLRPC.Message message = fjVar.f23965k;
            if (message != null && (richMessage = message.rich_message) != null) {
                this.f51640a = fjVar;
                String str2 = this.f51646i;
                if (str2 != null && !TextUtils.isEmpty(str2)) {
                    ArrayList e10 = org.telegram.messenger.iv.e(richMessage);
                    StringBuilder sb2 = new StringBuilder();
                    int i11 = 0;
                    while (true) {
                        ivVar = null;
                        if (i11 >= e10.size()) {
                            break;
                        }
                        if (i11 > 0) {
                            sb2.append('\n');
                        }
                        org.telegram.messenger.iv.b((TL_iv.RichText) e10.get(i11), sb2, null);
                        i11++;
                    }
                    if (sb2.indexOf(str2) >= 0) {
                        if (org.telegram.messenger.iv.c(fjVar)) {
                            iArr = org.telegram.messenger.iv.f(fjVar, this.f51646i, this.f51652o);
                        } else {
                            iArr = null;
                        }
                        if (iArr != null) {
                            ivVar = org.telegram.messenger.iv.k(iArr[0], iArr[1], fjVar);
                        }
                        if (ivVar != null) {
                            this.f51641b = iArr[0];
                            this.f51642c = iArr[1];
                            e(ivVar.f24729b, ivVar.f24728a);
                        } else {
                            this.f51641b = -1;
                            this.f51642c = -1;
                        }
                        this.f51644f = false;
                        return;
                    }
                }
                this.f51641b = 0;
                this.f51642c = Math.min(org.telegram.messenger.mp.u1(fjVar.K1).f25749r4, d(fjVar));
                this.f51644f = true;
                return;
            }
            org.telegram.messenger.a8.d("ReplyQuote.checkEdit: rich message is null");
            this.f51644f = false;
            return;
        }
        TLRPC.Message message2 = fjVar.f23965k;
        if (message2 != null && (str = message2.message) != null) {
            int i12 = this.f51642c;
            if (i12 >= this.f51641b && i12 <= str.length() && this.f51641b <= fjVar.f23965k.message.length() && (i7 = this.f51641b) >= 0 && (i10 = this.f51642c) >= 0) {
                if (TextUtils.equals(this.f51646i, fjVar.f23965k.message.substring(i7, i10))) {
                    this.f51640a = fjVar;
                    f();
                    this.f51644f = false;
                    return;
                }
                int indexOf = fjVar.f23965k.message.indexOf(this.f51646i);
                if (indexOf >= 0) {
                    this.f51640a = fjVar;
                    this.f51642c = (this.f51642c - this.f51641b) + indexOf;
                    this.f51641b = indexOf;
                    f();
                    this.f51644f = false;
                    return;
                }
                this.f51640a = fjVar;
                this.f51641b = 0;
                this.f51642c = fjVar.f23965k.message.length();
                f();
                this.f51644f = true;
                return;
            }
            org.telegram.messenger.a8.d("ReplyQuote.checkEdit: start/end are invalid (" + this.f51641b + ", " + this.f51642c + ", len=" + fjVar.f23965k.message.length() + ")");
            this.f51644f = false;
            return;
        }
        org.telegram.messenger.a8.d("ReplyQuote.checkEdit: message is null");
        this.f51644f = false;
    }

    public final void e(int i7, ArrayList arrayList) {
        this.f51651n = arrayList;
        this.f51652o = i7;
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            this.f51647j = arrayList2;
            String h = org.telegram.messenger.iv.h(arrayList, arrayList2);
            this.f51646i = h;
            h.getClass();
            return;
        }
        this.f51651n = null;
        this.f51646i = null;
        this.f51647j = null;
    }

    public final boolean f() {
        TLRPC.Message message;
        String str;
        int i7;
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji;
        int i10;
        if (this.f51650m) {
            int i11 = this.f51641b;
            if (i11 >= 0 && (i10 = this.f51642c) >= 0) {
                org.telegram.messenger.iv k10 = org.telegram.messenger.iv.k(i11, i10, this.f51640a);
                if (k10 == null) {
                    org.telegram.messenger.a8.d("ReplyQuote: failed to build a rich quote (" + this.f51641b + ", " + this.f51642c + ")");
                    e(0, null);
                    return false;
                }
                e(k10.f24729b, k10.f24728a);
                return true;
            } else if (this.f51651n == null) {
                return false;
            }
        } else {
            org.telegram.messenger.fj fjVar = this.f51640a;
            if (fjVar != null && (message = fjVar.f23965k) != null && (str = message.message) != null) {
                if (this.f51645g) {
                    TLRPC.TodoItem Z = org.telegram.messenger.fj.Z(this.d, fjVar);
                    if (Z == null) {
                        org.telegram.messenger.a8.d("ReplyQuote: todo task is not found");
                        return false;
                    }
                    this.f51648k = Z;
                    return true;
                } else if (this.h) {
                    TLRPC.PollAnswer X = org.telegram.messenger.fj.X(fjVar, this.f51643e);
                    if (X == null) {
                        org.telegram.messenger.a8.d("ReplyQuote: poll item is not found");
                        return false;
                    }
                    this.f51649l = X;
                    return true;
                } else {
                    int i12 = this.f51642c;
                    if (i12 >= this.f51641b && i12 <= str.length() && this.f51641b <= this.f51640a.f23965k.message.length() && (i7 = this.f51641b) >= 0 && this.f51642c >= 0) {
                        String str2 = this.f51640a.f23965k.message;
                        int max = Math.max(0, i7);
                        while (max < this.f51642c && Character.isWhitespace(str2.charAt(max))) {
                            max++;
                        }
                        int min = Math.min(this.f51642c, str2.length());
                        while (min > max && Character.isWhitespace(str2.charAt(min - 1))) {
                            min--;
                        }
                        if (max == min) {
                            org.telegram.messenger.a8.d("ReplyQuote: message is full of whitespace");
                            return false;
                        }
                        this.f51646i = this.f51640a.f23965k.message.substring(max, min);
                        ArrayList arrayList = this.f51647j;
                        if (arrayList != null) {
                            arrayList.clear();
                        }
                        ArrayList<TLRPC.MessageEntity> arrayList2 = this.f51640a.f23965k.entities;
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            for (int i13 = 0; i13 < this.f51640a.f23965k.entities.size(); i13++) {
                                TLRPC.MessageEntity messageEntity = this.f51640a.f23965k.entities.get(i13);
                                int i14 = messageEntity.offset;
                                int i15 = messageEntity.length + i14;
                                Typeface typeface = org.telegram.messenger.g0.f24090a;
                                if (Math.max(max, min) >= Math.min(i14, i15) && Math.max(i14, i15) >= Math.min(max, min)) {
                                    if (messageEntity instanceof TLRPC.TL_messageEntityBold) {
                                        tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityBold();
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityItalic) {
                                        tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityItalic();
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityUnderline) {
                                        tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityUnderline();
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityStrike) {
                                        tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityStrike();
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                                        tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntitySpoiler();
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                                        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji2 = new TLRPC.TL_messageEntityCustomEmoji();
                                        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji3 = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                                        tL_messageEntityCustomEmoji2.document_id = tL_messageEntityCustomEmoji3.document_id;
                                        tL_messageEntityCustomEmoji2.document = tL_messageEntityCustomEmoji3.document;
                                        tL_messageEntityCustomEmoji = tL_messageEntityCustomEmoji2;
                                    }
                                    int i16 = messageEntity.offset;
                                    int i17 = i16 - max;
                                    int i18 = (i16 + messageEntity.length) - max;
                                    if ((i17 >= 0 || i18 >= 0) && (i17 <= min || i18 <= min)) {
                                        tL_messageEntityCustomEmoji.offset = Math.max(0, i17);
                                        tL_messageEntityCustomEmoji.length = Math.min(i18, min - max) - tL_messageEntityCustomEmoji.offset;
                                        if (this.f51647j == null) {
                                            this.f51647j = new ArrayList();
                                        }
                                        this.f51647j.add(tL_messageEntityCustomEmoji);
                                    }
                                }
                            }
                        }
                    } else {
                        org.telegram.messenger.a8.d("ReplyQuote: start/end are invalid (" + this.f51641b + ", " + this.f51642c + ", len=" + this.f51640a.f23965k.message.length() + ")");
                        return false;
                    }
                }
            } else {
                org.telegram.messenger.a8.d("ReplyQuote: message is null");
                return false;
            }
        }
        return true;
    }
}
