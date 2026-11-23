package org.telegram.ui;

import android.graphics.Typeface;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class rm {
    public org.telegram.messenger.gj f51651a;
    public int f51652b;
    public int f51653c;
    public byte[] f51654e;
    public boolean f51655f;
    public boolean h;
    public String f51657i;
    public ArrayList f51658j;
    public TLRPC.TodoItem f51659k;
    public TLRPC.PollAnswer f51660l;
    public boolean f51661m;
    public ArrayList f51662n;
    public int f51663o;
    public boolean f51656g = false;
    public int d = -1;

    public rm(int i7, int i10, org.telegram.messenger.gj gjVar) {
        TLRPC.Message message;
        this.f51651a = gjVar;
        this.f51652b = i7;
        this.f51653c = i10;
        boolean z10 = false;
        if (gjVar != null && (message = gjVar.f24177k) != null && message.rich_message != null) {
            z10 = true;
        }
        this.f51661m = z10;
        f();
    }

    public static rm b(int i7, int i10, org.telegram.messenger.gj gjVar) {
        if (gjVar == null) {
            return null;
        }
        org.telegram.messenger.gj.B0(gjVar.f24177k);
        return new rm(i7, i10, gjVar);
    }

    public static rm c(org.telegram.messenger.gj gjVar) {
        TLRPC.Message message = gjVar.f24177k;
        if (message != null) {
            if (message.message != null || (message != null && message.rich_message != null)) {
                return b(0, Math.min(org.telegram.messenger.np.u1(gjVar.K1).f25912r4, d(gjVar)), gjVar);
            }
            return null;
        }
        return null;
    }

    public static int d(org.telegram.messenger.gj gjVar) {
        ?? r22;
        TLRPC.Message message = gjVar.f24177k;
        if (message != null) {
            if (message != null && message.rich_message != null) {
                org.telegram.messenger.fv fvVar = gjVar.f24234y2;
                if (fvVar != null && (r22 = fvVar.f23954q) != 0) {
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

    public final void a(org.telegram.messenger.gj gjVar) {
        String str;
        int i7;
        int i10;
        TL_iv.RichMessage richMessage;
        org.telegram.messenger.jv jvVar;
        int[] iArr;
        if (this.f51661m) {
            TLRPC.Message message = gjVar.f24177k;
            if (message != null && (richMessage = message.rich_message) != null) {
                this.f51651a = gjVar;
                String str2 = this.f51657i;
                if (str2 != null && !TextUtils.isEmpty(str2)) {
                    ArrayList e10 = org.telegram.messenger.jv.e(richMessage);
                    StringBuilder sb2 = new StringBuilder();
                    int i11 = 0;
                    while (true) {
                        jvVar = null;
                        if (i11 >= e10.size()) {
                            break;
                        }
                        if (i11 > 0) {
                            sb2.append('\n');
                        }
                        org.telegram.messenger.jv.b((TL_iv.RichText) e10.get(i11), sb2, null);
                        i11++;
                    }
                    if (sb2.indexOf(str2) >= 0) {
                        if (org.telegram.messenger.jv.c(gjVar)) {
                            iArr = org.telegram.messenger.jv.f(gjVar, this.f51657i, this.f51663o);
                        } else {
                            iArr = null;
                        }
                        if (iArr != null) {
                            jvVar = org.telegram.messenger.jv.k(iArr[0], iArr[1], gjVar);
                        }
                        if (jvVar != null) {
                            this.f51652b = iArr[0];
                            this.f51653c = iArr[1];
                            e(jvVar.f24893b, jvVar.f24892a);
                        } else {
                            this.f51652b = -1;
                            this.f51653c = -1;
                        }
                        this.f51655f = false;
                        return;
                    }
                }
                this.f51652b = 0;
                this.f51653c = Math.min(org.telegram.messenger.np.u1(gjVar.K1).f25912r4, d(gjVar));
                this.f51655f = true;
                return;
            }
            org.telegram.messenger.a8.d("ReplyQuote.checkEdit: rich message is null");
            this.f51655f = false;
            return;
        }
        TLRPC.Message message2 = gjVar.f24177k;
        if (message2 != null && (str = message2.message) != null) {
            int i12 = this.f51653c;
            if (i12 >= this.f51652b && i12 <= str.length() && this.f51652b <= gjVar.f24177k.message.length() && (i7 = this.f51652b) >= 0 && (i10 = this.f51653c) >= 0) {
                if (TextUtils.equals(this.f51657i, gjVar.f24177k.message.substring(i7, i10))) {
                    this.f51651a = gjVar;
                    f();
                    this.f51655f = false;
                    return;
                }
                int indexOf = gjVar.f24177k.message.indexOf(this.f51657i);
                if (indexOf >= 0) {
                    this.f51651a = gjVar;
                    this.f51653c = (this.f51653c - this.f51652b) + indexOf;
                    this.f51652b = indexOf;
                    f();
                    this.f51655f = false;
                    return;
                }
                this.f51651a = gjVar;
                this.f51652b = 0;
                this.f51653c = gjVar.f24177k.message.length();
                f();
                this.f51655f = true;
                return;
            }
            org.telegram.messenger.a8.d("ReplyQuote.checkEdit: start/end are invalid (" + this.f51652b + ", " + this.f51653c + ", len=" + gjVar.f24177k.message.length() + ")");
            this.f51655f = false;
            return;
        }
        org.telegram.messenger.a8.d("ReplyQuote.checkEdit: message is null");
        this.f51655f = false;
    }

    public final void e(int i7, ArrayList arrayList) {
        this.f51662n = arrayList;
        this.f51663o = i7;
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            this.f51658j = arrayList2;
            String h = org.telegram.messenger.jv.h(arrayList, arrayList2);
            this.f51657i = h;
            h.getClass();
            return;
        }
        this.f51662n = null;
        this.f51657i = null;
        this.f51658j = null;
    }

    public final boolean f() {
        TLRPC.Message message;
        String str;
        int i7;
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji;
        int i10;
        if (this.f51661m) {
            int i11 = this.f51652b;
            if (i11 >= 0 && (i10 = this.f51653c) >= 0) {
                org.telegram.messenger.jv k10 = org.telegram.messenger.jv.k(i11, i10, this.f51651a);
                if (k10 == null) {
                    org.telegram.messenger.a8.d("ReplyQuote: failed to build a rich quote (" + this.f51652b + ", " + this.f51653c + ")");
                    e(0, null);
                    return false;
                }
                e(k10.f24893b, k10.f24892a);
                return true;
            } else if (this.f51662n == null) {
                return false;
            }
        } else {
            org.telegram.messenger.gj gjVar = this.f51651a;
            if (gjVar != null && (message = gjVar.f24177k) != null && (str = message.message) != null) {
                if (this.f51656g) {
                    TLRPC.TodoItem Z = org.telegram.messenger.gj.Z(this.d, gjVar);
                    if (Z == null) {
                        org.telegram.messenger.a8.d("ReplyQuote: todo task is not found");
                        return false;
                    }
                    this.f51659k = Z;
                    return true;
                } else if (this.h) {
                    TLRPC.PollAnswer X = org.telegram.messenger.gj.X(gjVar, this.f51654e);
                    if (X == null) {
                        org.telegram.messenger.a8.d("ReplyQuote: poll item is not found");
                        return false;
                    }
                    this.f51660l = X;
                    return true;
                } else {
                    int i12 = this.f51653c;
                    if (i12 >= this.f51652b && i12 <= str.length() && this.f51652b <= this.f51651a.f24177k.message.length() && (i7 = this.f51652b) >= 0 && this.f51653c >= 0) {
                        String str2 = this.f51651a.f24177k.message;
                        int max = Math.max(0, i7);
                        while (max < this.f51653c && Character.isWhitespace(str2.charAt(max))) {
                            max++;
                        }
                        int min = Math.min(this.f51653c, str2.length());
                        while (min > max && Character.isWhitespace(str2.charAt(min - 1))) {
                            min--;
                        }
                        if (max == min) {
                            org.telegram.messenger.a8.d("ReplyQuote: message is full of whitespace");
                            return false;
                        }
                        this.f51657i = this.f51651a.f24177k.message.substring(max, min);
                        ArrayList arrayList = this.f51658j;
                        if (arrayList != null) {
                            arrayList.clear();
                        }
                        ArrayList<TLRPC.MessageEntity> arrayList2 = this.f51651a.f24177k.entities;
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            for (int i13 = 0; i13 < this.f51651a.f24177k.entities.size(); i13++) {
                                TLRPC.MessageEntity messageEntity = this.f51651a.f24177k.entities.get(i13);
                                int i14 = messageEntity.offset;
                                int i15 = messageEntity.length + i14;
                                Typeface typeface = org.telegram.messenger.g0.f23982a;
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
                                        if (this.f51658j == null) {
                                            this.f51658j = new ArrayList();
                                        }
                                        this.f51658j.add(tL_messageEntityCustomEmoji);
                                    }
                                }
                            }
                        }
                    } else {
                        org.telegram.messenger.a8.d("ReplyQuote: start/end are invalid (" + this.f51652b + ", " + this.f51653c + ", len=" + this.f51651a.f24177k.message.length() + ")");
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
