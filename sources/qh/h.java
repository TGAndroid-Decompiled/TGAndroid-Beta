package qh;

import android.text.TextUtils;
import android.util.SparseArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class h {
    public final f f42069a;
    public final TLRPC.TL_messageMediaPoll f42070b;
    public final TLRPC.TL_inputMediaPoll f42071c;
    public final long d;
    public final String e;
    public final ArrayList f42072f;

    public h(f fVar, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, long j3, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f42069a = fVar;
        this.d = j3;
        this.e = str;
        this.f42072f = arrayList;
        TLRPC.TL_inputMediaPoll tL_inputMediaPoll = new TLRPC.TL_inputMediaPoll();
        TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
        tL_inputMediaPoll.poll = tL_poll;
        TLRPC.Poll poll = tL_messageMediaPoll.poll;
        tL_poll.f18361id = poll.f18361id;
        tL_poll.flags = poll.flags;
        tL_poll.closed = poll.closed;
        tL_poll.public_voters = poll.public_voters;
        tL_poll.multiple_choice = poll.multiple_choice;
        tL_poll.open_answers = poll.open_answers;
        tL_poll.revoting_disabled = poll.revoting_disabled;
        tL_poll.shuffle_answers = poll.shuffle_answers;
        tL_poll.subscribers_only = poll.subscribers_only;
        tL_poll.countries_iso2 = poll.countries_iso2;
        tL_poll.hide_results_until_close = poll.hide_results_until_close;
        tL_poll.creator = poll.creator;
        tL_poll.quiz = poll.quiz;
        tL_poll.answers = new ArrayList<>(tL_messageMediaPoll.poll.answers);
        ArrayList<TLRPC.PollAnswer> arrayList3 = tL_messageMediaPoll.poll.answers;
        int size = arrayList3.size();
        int i10 = 0;
        while (i10 < size) {
            TLRPC.PollAnswer pollAnswer = arrayList3.get(i10);
            i10++;
            new TLRPC.TL_inputPollAnswer().text = pollAnswer.text;
        }
        TLRPC.Poll poll2 = tL_inputMediaPoll.poll;
        TLRPC.Poll poll3 = tL_messageMediaPoll.poll;
        poll2.question = poll3.question;
        poll2.close_period = poll3.close_period;
        poll2.close_date = poll3.close_date;
        poll2.hash = poll3.hash;
        TLRPC.PollResults pollResults = tL_messageMediaPoll.results;
        if (pollResults != null && !TextUtils.isEmpty(pollResults.solution)) {
            TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
            tL_inputMediaPoll.solution = pollResults2.solution;
            tL_inputMediaPoll.solution_entities = pollResults2.solution_entities;
            tL_inputMediaPoll.flags |= 2;
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            tL_inputMediaPoll.correct_answers = new ArrayList<>(arrayList2);
            tL_inputMediaPoll.flags |= 1;
        }
        if (fVar != null) {
            SparseArray sparseArray = fVar.f42051a;
            int size2 = sparseArray.size();
            for (int i11 = 0; i11 < size2; i11++) {
                int keyAt = sparseArray.keyAt(i11);
                e eVar = (e) sparseArray.valueAt(i11);
                if (eVar instanceof rh.e) {
                    TLRPC.TL_inputMediaWebPage tL_inputMediaWebPage = new TLRPC.TL_inputMediaWebPage();
                    tL_inputMediaWebPage.url = ((rh.e) eVar).f42877b;
                    tL_inputMediaWebPage.optional = true;
                    f.k(tL_inputMediaPoll, keyAt, tL_inputMediaWebPage);
                } else if (eVar instanceof rh.f) {
                    f.k(tL_inputMediaPoll, keyAt, zf.d.h(((rh.f) eVar).f42883b));
                } else if (eVar instanceof rh.h) {
                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument = new TLRPC.TL_inputMediaDocument();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    TLRPC.Document document = ((rh.h) eVar).f42886b;
                    tL_inputDocument.f18347id = document.f18341id;
                    tL_inputDocument.access_hash = document.access_hash;
                    tL_inputDocument.file_reference = document.file_reference;
                    tL_inputMediaDocument.f18396id = tL_inputDocument;
                    f.k(tL_inputMediaPoll, keyAt, tL_inputMediaDocument);
                }
            }
            int size3 = sparseArray.size();
            for (int i12 = 0; i12 < size3; i12++) {
                int keyAt2 = sparseArray.keyAt(i12);
                e eVar2 = (e) sparseArray.valueAt(i12);
                if (eVar2 instanceof rh.e) {
                    TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
                    TLRPC.TL_webPage tL_webPage = new TLRPC.TL_webPage();
                    tL_messageMediaWebPage.webpage = tL_webPage;
                    String str2 = ((rh.e) eVar2).f42877b;
                    tL_webPage.display_url = str2;
                    tL_webPage.url = str2;
                    f.l(tL_messageMediaPoll, keyAt2, tL_messageMediaWebPage);
                } else if (eVar2 instanceof rh.f) {
                    f.l(tL_messageMediaPoll, keyAt2, ((rh.f) eVar2).f42883b);
                } else if (eVar2 instanceof rh.h) {
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                    tL_messageMediaDocument.document = ((rh.h) eVar2).f42886b;
                    f.l(tL_messageMediaPoll, keyAt2, tL_messageMediaDocument);
                }
            }
        }
        this.f42070b = tL_messageMediaPoll;
        this.f42071c = tL_inputMediaPoll;
    }
}
