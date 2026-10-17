package s3;

import a1.g;
import j$.util.DesugarCollections;
import java.util.List;
public final class d extends b {
    public final long f45906a;
    public final long f45907b;
    public final List f45908c;

    public d(long j10, long j11, List list) {
        this.f45906a = j10;
        this.f45907b = j11;
        this.f45908c = DesugarCollections.unmodifiableList(list);
    }

    @Override
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb2.append(this.f45906a);
        sb2.append(", programSplicePlaybackPositionUs= ");
        return g.r(sb2, this.f45907b, " }");
    }
}
