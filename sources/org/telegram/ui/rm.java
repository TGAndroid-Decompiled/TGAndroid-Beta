package org.telegram.ui;

import android.graphics.Typeface;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class rm {
    public org.telegram.messenger.fj f51746a;
    public int f51747b;
    public int f51748c;
    public byte[] f51749e;
    public boolean f51750f;
    public boolean h;
    public String f51752i;
    public ArrayList f51753j;
    public TLRPC.TodoItem f51754k;
    public TLRPC.PollAnswer f51755l;
    public boolean f51756m;
    public ArrayList f51757n;
    public int f51758o;
    public boolean f51751g = false;
    public int d = -1;

    public rm(int i7, int i10, org.telegram.messenger.fj fjVar) {
        TLRPC.Message message;
        this.f51746a = fjVar;
        this.f51747b = i7;
        this.f51748c = i10;
        boolean z10 = false;
        if (fjVar != null && (message = fjVar.f24073k) != null && message.rich_message != null) {
            z10 = true;
        }
        this.f51756m = z10;
        f();
    }

    public static rm b(int i7, int i10, org.telegram.messenger.fj fjVar) {
        if (fjVar == null) {
            return null;
        }
        org.telegram.messenger.fj.B0(fjVar.f24073k);
        return new rm(i7, i10, fjVar);
    }

    public static rm c(org.telegram.messenger.fj fjVar) {
        TLRPC.Message message = fjVar.f24073k;
        if (message != null) {
            if (message.message != null || (message != null && message.rich_message != null)) {
                return b(0, Math.min(org.telegram.messenger.mp.u1(fjVar.K1).f25844r4, d(fjVar)), fjVar);
            }
            return null;
        }
        return null;
    }

    public static int d(org.telegram.messenger.fj fjVar) {
        ?? r22;
        TLRPC.Message message = fjVar.f24073k;
        if (message != null) {
            if (message != null && message.rich_message != null) {
                org.telegram.messenger.ev evVar = fjVar.f24130y2;
                if (evVar != null && (r22 = evVar.f23886q) != 0) {
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
        if (this.f51756m) {
            TLRPC.Message message = fjVar.f24073k;
            if (message != null && (richMessage = message.rich_message) != null) {
                this.f51746a = fjVar;
                String str2 = this.f51752i;
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
                            iArr = org.telegram.messenger.iv.f(fjVar, this.f51752i, this.f51758o);
                        } else {
                            iArr = null;
                        }
                        if (iArr != null) {
                            ivVar = org.telegram.messenger.iv.k(iArr[0], iArr[1], fjVar);
                        }
                        if (ivVar != null) {
                            this.f51747b = iArr[0];
                            this.f51748c = iArr[1];
                            e(ivVar.f24855b, ivVar.f24854a);
                        } else {
                            this.f51747b = -1;
                            this.f51748c = -1;
                        }
                        this.f51750f = false;
                        return;
                    }
                }
                this.f51747b = 0;
                this.f51748c = Math.min(org.telegram.messenger.mp.u1(fjVar.K1).f25844r4, d(fjVar));
                this.f51750f = true;
                return;
            }
            org.telegram.messenger.a8.d("ReplyQuote.checkEdit: rich message is null");
            this.f51750f = false;
            return;
        }
        TLRPC.Message message2 = fjVar.f24073k;
        if (message2 != null && (str = message2.message) != null) {
            int i12 = this.f51748c;
            if (i12 >= this.f51747b && i12 <= str.length() && this.f51747b <= fjVar.f24073k.message.length() && (i7 = this.f51747b) >= 0 && (i10 = this.f51748c) >= 0) {
                if (TextUtils.equals(this.f51752i, fjVar.f24073k.message.substring(i7, i10))) {
                    this.f51746a = fjVar;
                    f();
                    this.f51750f = false;
                    return;
                }
                int indexOf = fjVar.f24073k.message.indexOf(this.f51752i);
                if (indexOf >= 0) {
                    this.f51746a = fjVar;
                    this.f51748c = (this.f51748c - this.f51747b) + indexOf;
                    this.f51747b = indexOf;
                    f();
                    this.f51750f = false;
                    return;
                }
                this.f51746a = fjVar;
                this.f51747b = 0;
                this.f51748c = fjVar.f24073k.message.length();
                f();
                this.f51750f = true;
                return;
            }
            org.telegram.messenger.a8.d("ReplyQuote.checkEdit: start/end are invalid (" + this.f51747b + ", " + this.f51748c + ", len=" + fjVar.f24073k.message.length() + ")");
            this.f51750f = false;
            return;
        }
        org.telegram.messenger.a8.d("ReplyQuote.checkEdit: message is null");
        this.f51750f = false;
    }

    public final void e(int i7, ArrayList arrayList) {
        this.f51757n = arrayList;
        this.f51758o = i7;
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            this.f51753j = arrayList2;
            String h = org.telegram.messenger.iv.h(arrayList, arrayList2);
            this.f51752i = h;
            h.getClass();
            return;
        }
        this.f51757n = null;
        this.f51752i = null;
        this.f51753j = null;
    }

    public final boolean f() {
        TLRPC.Message message;
        String str;
        int i7;
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji;
        int i10;
        if (this.f51756m) {
            int i11 = this.f51747b;
            if (i11 >= 0 && (i10 = this.f51748c) >= 0) {
                org.telegram.messenger.iv k10 = org.telegram.messenger.iv.k(i11, i10, this.f51746a);
                if (k10 == null) {
                    org.telegram.messenger.a8.d("ReplyQuote: failed to build a rich quote (" + this.f51747b + ", " + this.f51748c + ")");
                    e(0, null);
                    return false;
                }
                e(k10.f24855b, k10.f24854a);
                return true;
            } else if (this.f51757n == null) {
                return false;
            }
        } else {
            org.telegram.messenger.fj fjVar = this.f51746a;
            if (fjVar != null && (message = fjVar.f24073k) != null && (str = message.message) != null) {
                if (this.f51751g) {
                    TLRPC.TodoItem Z = org.telegram.messenger.fj.Z(this.d, fjVar);
                    if (Z == null) {
                        org.telegram.messenger.a8.d("ReplyQuote: todo task is not found");
                        return false;
                    }
                    this.f51754k = Z;
                    return true;
                } else if (this.h) {
                    TLRPC.PollAnswer X = org.telegram.messenger.fj.X(fjVar, this.f51749e);
                    if (X == null) {
                        org.telegram.messenger.a8.d("ReplyQuote: poll item is not found");
                        return false;
                    }
                    this.f51755l = X;
                    return true;
                } else {
                    int i12 = this.f51748c;
                    if (i12 >= this.f51747b && i12 <= str.length() && this.f51747b <= this.f51746a.f24073k.message.length() && (i7 = this.f51747b) >= 0 && this.f51748c >= 0) {
                        String str2 = this.f51746a.f24073k.message;
                        int max = Math.max(0, i7);
                        while (max < this.f51748c && Character.isWhitespace(str2.charAt(max))) {
                            max++;
                        }
                        int min = Math.min(this.f51748c, str2.length());
                        while (min > max && Character.isWhitespace(str2.charAt(min - 1))) {
                            min--;
                        }
                        if (max == min) {
                            org.telegram.messenger.a8.d("ReplyQuote: message is full of whitespace");
                            return false;
                        }
                        this.f51752i = this.f51746a.f24073k.message.substring(max, min);
                        ArrayList arrayList = this.f51753j;
                        if (arrayList != null) {
                            arrayList.clear();
                        }
                        ArrayList<TLRPC.MessageEntity> arrayList2 = this.f51746a.f24073k.entities;
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            for (int i13 = 0; i13 < this.f51746a.f24073k.entities.size(); i13++) {
                                TLRPC.MessageEntity messageEntity = this.f51746a.f24073k.entities.get(i13);
                                int i14 = messageEntity.offset;
                                int i15 = messageEntity.length + i14;
                                Typeface typeface = org.telegram.messenger.g0.f24198a;
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
                                        if (this.f51753j == null) {
                                            this.f51753j = new ArrayList();
                                        }
                                        this.f51753j.add(tL_messageEntityCustomEmoji);
                                    }
                                }
                            }
                        }
                    } else {
                        org.telegram.messenger.a8.d("ReplyQuote: start/end are invalid (" + this.f51747b + ", " + this.f51748c + ", len=" + this.f51746a.f24073k.message.length() + ")");
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
