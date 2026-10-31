package xh;

import android.content.Context;
import android.location.Location;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class p2 implements Runnable {
    public final int f53965a;
    public final Object f53966b;
    public final Object f53967c;
    public final Object d;
    public final Object e;

    public p2(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f53965a = i10;
        this.f53966b = obj;
        this.f53967c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void run() {
        switch (this.f53965a) {
            case 0:
                z2.z0((z2) this.f53966b, (Context) this.f53967c, (TLRPC.User) this.d, (TL_payments.connectedBotStarRef) this.e);
                return;
            case 1:
                boolean[] zArr = (boolean[]) this.f53967c;
                org.telegram.ui.web.o oVar = (org.telegram.ui.web.o) this.d;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.e;
                if (!(((TLObject) this.f53966b) instanceof TLRPC.TL_boolTrue)) {
                    if (!zArr[0]) {
                        zArr[0] = true;
                        oVar.a(Boolean.TRUE, "cancelled");
                        return;
                    }
                    return;
                }
                userFull.bot_can_manage_emoji_status = true;
                if (!zArr[0]) {
                    zArr[0] = true;
                    oVar.a(Boolean.TRUE, "allowed");
                    return;
                }
                return;
            case 2:
                zf.c cVar = (zf.c) this.f53966b;
                Location location = (Location) this.f53967c;
                String str = (String) this.d;
                ArrayList arrayList = (ArrayList) this.e;
                ArrayList arrayList2 = cVar.f55454r;
                cVar.f55453n = false;
                if (location == null) {
                    cVar.F = 0;
                    cVar.h = false;
                    cVar.f55455s.clear();
                    cVar.J = false;
                    cVar.f55458y = str;
                }
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                cVar.f();
                return;
            default:
                zf.c cVar2 = (zf.c) this.f53966b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f53967c;
                String str2 = (String) this.d;
                TLObject tLObject = (TLObject) this.e;
                ArrayList arrayList3 = cVar2.f55455s;
                if (tL_error == null) {
                    cVar2.F = 0;
                    cVar2.h = false;
                    arrayList3.clear();
                    cVar2.J = false;
                    cVar2.f55458y = str2;
                    TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                    int size = messages_botresults.results.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i10);
                        if ("venue".equals(botInlineResult.type)) {
                            TLRPC.BotInlineMessage botInlineMessage = botInlineResult.send_message;
                            if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaVenue) {
                                TLRPC.TL_botInlineMessageMediaVenue tL_botInlineMessageMediaVenue = (TLRPC.TL_botInlineMessageMediaVenue) botInlineMessage;
                                TLRPC.TL_messageMediaVenue tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
                                tL_messageMediaVenue.geo = tL_botInlineMessageMediaVenue.geo;
                                tL_messageMediaVenue.address = tL_botInlineMessageMediaVenue.address;
                                tL_messageMediaVenue.title = tL_botInlineMessageMediaVenue.title;
                                tL_messageMediaVenue.icon = a1.g.r(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), tL_botInlineMessageMediaVenue.venue_type, "_64.png");
                                tL_messageMediaVenue.venue_type = tL_botInlineMessageMediaVenue.venue_type;
                                tL_messageMediaVenue.venue_id = tL_botInlineMessageMediaVenue.venue_id;
                                tL_messageMediaVenue.provider = tL_botInlineMessageMediaVenue.provider;
                                tL_messageMediaVenue.query_id = messages_botresults.query_id;
                                tL_messageMediaVenue.result_id = botInlineResult.f19791id;
                                arrayList3.add(tL_messageMediaVenue);
                            }
                        }
                    }
                }
                zf.b bVar = cVar2.D;
                if (bVar != null) {
                    bVar.b(arrayList3);
                }
                cVar2.f();
                return;
        }
    }
}
