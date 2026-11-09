package org.telegram.ui;

import android.graphics.Typeface;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class sm {
    public org.telegram.messenger.ij f49943a;
    public int f49944b;
    public int f49945c;
    public byte[] f49946e;
    public boolean f49947f;
    public boolean h;
    public String f49949i;
    public ArrayList f49950j;
    public TLRPC.TodoItem f49951k;
    public TLRPC.PollAnswer f49952l;
    public boolean f49953m;
    public ArrayList f49954n;
    public int f49955o;
    public boolean f49948g = false;
    public int d = -1;

    public sm(int i7, int i10, org.telegram.messenger.ij ijVar) {
        TLRPC.Message message;
        this.f49943a = ijVar;
        this.f49944b = i7;
        this.f49945c = i10;
        boolean z9 = false;
        if (ijVar != null && (message = ijVar.f23262k) != null && message.rich_message != null) {
            z9 = true;
        }
        this.f49953m = z9;
        f();
    }

    public static sm b(int i7, int i10, org.telegram.messenger.ij ijVar) {
        if (ijVar == null) {
            return null;
        }
        org.telegram.messenger.ij.B0(ijVar.f23262k);
        return new sm(i7, i10, ijVar);
    }

    public static sm c(org.telegram.messenger.ij ijVar) {
        TLRPC.Message message = ijVar.f23262k;
        if (message != null) {
            if (message.message != null || (message != null && message.rich_message != null)) {
                return b(0, Math.min(org.telegram.messenger.qp.s1(ijVar.I1).o4, d(ijVar)), ijVar);
            }
            return null;
        }
        return null;
    }

    public static int d(org.telegram.messenger.ij ijVar) {
        ?? r22;
        TLRPC.Message message = ijVar.f23262k;
        if (message != null) {
            if (message != null && message.rich_message != null) {
                org.telegram.messenger.kv kvVar = ijVar.f23309w2;
                if (kvVar != null && (r22 = kvVar.f23777q) != 0) {
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

    public final void a(org.telegram.messenger.ij ijVar) {
        String str;
        int i7;
        int i10;
        TL_iv.RichMessage richMessage;
        org.telegram.messenger.ov ovVar;
        int[] iArr;
        if (this.f49953m) {
            TLRPC.Message message = ijVar.f23262k;
            if (message != null && (richMessage = message.rich_message) != null) {
                this.f49943a = ijVar;
                String str2 = this.f49949i;
                if (str2 != null && !TextUtils.isEmpty(str2)) {
                    ArrayList e10 = org.telegram.messenger.ov.e(richMessage);
                    StringBuilder sb2 = new StringBuilder();
                    int i11 = 0;
                    while (true) {
                        ovVar = null;
                        if (i11 >= e10.size()) {
                            break;
                        }
                        if (i11 > 0) {
                            sb2.append('\n');
                        }
                        org.telegram.messenger.ov.b((TL_iv.RichText) e10.get(i11), sb2, null);
                        i11++;
                    }
                    if (sb2.indexOf(str2) >= 0) {
                        if (org.telegram.messenger.ov.c(ijVar)) {
                            iArr = org.telegram.messenger.ov.f(ijVar, this.f49949i, this.f49955o);
                        } else {
                            iArr = null;
                        }
                        if (iArr != null) {
                            ovVar = org.telegram.messenger.ov.k(iArr[0], iArr[1], ijVar);
                        }
                        if (ovVar != null) {
                            this.f49944b = iArr[0];
                            this.f49945c = iArr[1];
                            e(ovVar.f24401b, ovVar.f24400a);
                        } else {
                            this.f49944b = -1;
                            this.f49945c = -1;
                        }
                        this.f49947f = false;
                        return;
                    }
                }
                this.f49944b = 0;
                this.f49945c = Math.min(org.telegram.messenger.qp.s1(ijVar.I1).o4, d(ijVar));
                this.f49947f = true;
                return;
            }
            org.telegram.messenger.a8.d("ReplyQuote.checkEdit: rich message is null");
            this.f49947f = false;
            return;
        }
        TLRPC.Message message2 = ijVar.f23262k;
        if (message2 != null && (str = message2.message) != null) {
            int i12 = this.f49945c;
            if (i12 >= this.f49944b && i12 <= str.length() && this.f49944b <= ijVar.f23262k.message.length() && (i7 = this.f49944b) >= 0 && (i10 = this.f49945c) >= 0) {
                if (TextUtils.equals(this.f49949i, ijVar.f23262k.message.substring(i7, i10))) {
                    this.f49943a = ijVar;
                    f();
                    this.f49947f = false;
                    return;
                }
                int indexOf = ijVar.f23262k.message.indexOf(this.f49949i);
                if (indexOf >= 0) {
                    this.f49943a = ijVar;
                    this.f49945c = (this.f49945c - this.f49944b) + indexOf;
                    this.f49944b = indexOf;
                    f();
                    this.f49947f = false;
                    return;
                }
                this.f49943a = ijVar;
                this.f49944b = 0;
                this.f49945c = ijVar.f23262k.message.length();
                f();
                this.f49947f = true;
                return;
            }
            org.telegram.messenger.a8.d("ReplyQuote.checkEdit: start/end are invalid (" + this.f49944b + ", " + this.f49945c + ", len=" + ijVar.f23262k.message.length() + ")");
            this.f49947f = false;
            return;
        }
        org.telegram.messenger.a8.d("ReplyQuote.checkEdit: message is null");
        this.f49947f = false;
    }

    public final void e(int i7, ArrayList arrayList) {
        this.f49954n = arrayList;
        this.f49955o = i7;
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            this.f49950j = arrayList2;
            String h = org.telegram.messenger.ov.h(arrayList, arrayList2);
            this.f49949i = h;
            h.getClass();
            return;
        }
        this.f49954n = null;
        this.f49949i = null;
        this.f49950j = null;
    }

    public final boolean f() {
        TLRPC.Message message;
        String str;
        int i7;
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji;
        int i10;
        if (this.f49953m) {
            int i11 = this.f49944b;
            if (i11 >= 0 && (i10 = this.f49945c) >= 0) {
                org.telegram.messenger.ov k10 = org.telegram.messenger.ov.k(i11, i10, this.f49943a);
                if (k10 == null) {
                    org.telegram.messenger.a8.d("ReplyQuote: failed to build a rich quote (" + this.f49944b + ", " + this.f49945c + ")");
                    e(0, null);
                    return false;
                }
                e(k10.f24401b, k10.f24400a);
                return true;
            } else if (this.f49954n == null) {
                return false;
            }
        } else {
            org.telegram.messenger.ij ijVar = this.f49943a;
            if (ijVar != null && (message = ijVar.f23262k) != null && (str = message.message) != null) {
                if (this.f49948g) {
                    TLRPC.TodoItem Z = org.telegram.messenger.ij.Z(this.d, ijVar);
                    if (Z == null) {
                        org.telegram.messenger.a8.d("ReplyQuote: todo task is not found");
                        return false;
                    }
                    this.f49951k = Z;
                    return true;
                } else if (this.h) {
                    TLRPC.PollAnswer X = org.telegram.messenger.ij.X(ijVar, this.f49946e);
                    if (X == null) {
                        org.telegram.messenger.a8.d("ReplyQuote: poll item is not found");
                        return false;
                    }
                    this.f49952l = X;
                    return true;
                } else {
                    int i12 = this.f49945c;
                    if (i12 >= this.f49944b && i12 <= str.length() && this.f49944b <= this.f49943a.f23262k.message.length() && (i7 = this.f49944b) >= 0 && this.f49945c >= 0) {
                        String str2 = this.f49943a.f23262k.message;
                        int max = Math.max(0, i7);
                        while (max < this.f49945c && Character.isWhitespace(str2.charAt(max))) {
                            max++;
                        }
                        int min = Math.min(this.f49945c, str2.length());
                        while (min > max && Character.isWhitespace(str2.charAt(min - 1))) {
                            min--;
                        }
                        if (max == min) {
                            org.telegram.messenger.a8.d("ReplyQuote: message is full of whitespace");
                            return false;
                        }
                        this.f49949i = this.f49943a.f23262k.message.substring(max, min);
                        ArrayList arrayList = this.f49950j;
                        if (arrayList != null) {
                            arrayList.clear();
                        }
                        ArrayList<TLRPC.MessageEntity> arrayList2 = this.f49943a.f23262k.entities;
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            for (int i13 = 0; i13 < this.f49943a.f23262k.entities.size(); i13++) {
                                TLRPC.MessageEntity messageEntity = this.f49943a.f23262k.entities.get(i13);
                                int i14 = messageEntity.offset;
                                int i15 = messageEntity.length + i14;
                                Typeface typeface = org.telegram.messenger.g0.f22535a;
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
                                        if (this.f49950j == null) {
                                            this.f49950j = new ArrayList();
                                        }
                                        this.f49950j.add(tL_messageEntityCustomEmoji);
                                    }
                                }
                            }
                        }
                    } else {
                        org.telegram.messenger.a8.d("ReplyQuote: start/end are invalid (" + this.f49944b + ", " + this.f49945c + ", len=" + this.f49943a.f23262k.message.length() + ")");
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
