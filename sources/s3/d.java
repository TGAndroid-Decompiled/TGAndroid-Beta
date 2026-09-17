package s3;

import j$.util.DesugarCollections;
import java.util.List;
public final class d extends b {
    public final long f45697a;
    public final long f45698b;
    public final List f45699c;

    public d(long j3, long j10, List list) {
        this.f45697a = j3;
        this.f45698b = j10;
        this.f45699c = DesugarCollections.unmodifiableList(list);
    }

    @Override
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb2.append(this.f45697a);
        sb2.append(", programSplicePlaybackPositionUs= ");
        return a4.a.r(sb2, this.f45698b, " }");
    }
}
