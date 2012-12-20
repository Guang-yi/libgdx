/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btSoftBodyFloatData {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected btSoftBodyFloatData(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(btSoftBodyFloatData obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btSoftBodyFloatData(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setM_collisionObjectData(btCollisionObjectFloatData value) {
    gdxBulletJNI.btSoftBodyFloatData_m_collisionObjectData_set(swigCPtr, this, btCollisionObjectFloatData.getCPtr(value), value);
  }

  public btCollisionObjectFloatData getM_collisionObjectData() {
    long cPtr = gdxBulletJNI.btSoftBodyFloatData_m_collisionObjectData_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btCollisionObjectFloatData(cPtr, false);
  }

  public void setM_pose(SoftBodyPoseData value) {
    gdxBulletJNI.btSoftBodyFloatData_m_pose_set(swigCPtr, this, SoftBodyPoseData.getCPtr(value), value);
  }

  public SoftBodyPoseData getM_pose() {
    long cPtr = gdxBulletJNI.btSoftBodyFloatData_m_pose_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SoftBodyPoseData(cPtr, false);
  }

  public void setM_materials(SWIGTYPE_p_p_SoftBodyMaterialData value) {
    gdxBulletJNI.btSoftBodyFloatData_m_materials_set(swigCPtr, this, SWIGTYPE_p_p_SoftBodyMaterialData.getCPtr(value));
  }

  public SWIGTYPE_p_p_SoftBodyMaterialData getM_materials() {
    long cPtr = gdxBulletJNI.btSoftBodyFloatData_m_materials_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_p_SoftBodyMaterialData(cPtr, false);
  }

  public void setM_nodes(SoftBodyNodeData value) {
    gdxBulletJNI.btSoftBodyFloatData_m_nodes_set(swigCPtr, this, SoftBodyNodeData.getCPtr(value), value);
  }

  public SoftBodyNodeData getM_nodes() {
    long cPtr = gdxBulletJNI.btSoftBodyFloatData_m_nodes_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SoftBodyNodeData(cPtr, false);
  }

  public void setM_links(SoftBodyLinkData value) {
    gdxBulletJNI.btSoftBodyFloatData_m_links_set(swigCPtr, this, SoftBodyLinkData.getCPtr(value), value);
  }

  public SoftBodyLinkData getM_links() {
    long cPtr = gdxBulletJNI.btSoftBodyFloatData_m_links_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SoftBodyLinkData(cPtr, false);
  }

  public void setM_faces(SoftBodyFaceData value) {
    gdxBulletJNI.btSoftBodyFloatData_m_faces_set(swigCPtr, this, SoftBodyFaceData.getCPtr(value), value);
  }

  public SoftBodyFaceData getM_faces() {
    long cPtr = gdxBulletJNI.btSoftBodyFloatData_m_faces_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SoftBodyFaceData(cPtr, false);
  }

  public void setM_tetrahedra(SoftBodyTetraData value) {
    gdxBulletJNI.btSoftBodyFloatData_m_tetrahedra_set(swigCPtr, this, SoftBodyTetraData.getCPtr(value), value);
  }

  public SoftBodyTetraData getM_tetrahedra() {
    long cPtr = gdxBulletJNI.btSoftBodyFloatData_m_tetrahedra_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SoftBodyTetraData(cPtr, false);
  }

  public void setM_anchors(SoftRigidAnchorData value) {
    gdxBulletJNI.btSoftBodyFloatData_m_anchors_set(swigCPtr, this, SoftRigidAnchorData.getCPtr(value), value);
  }

  public SoftRigidAnchorData getM_anchors() {
    long cPtr = gdxBulletJNI.btSoftBodyFloatData_m_anchors_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SoftRigidAnchorData(cPtr, false);
  }

  public void setM_clusters(SoftBodyClusterData value) {
    gdxBulletJNI.btSoftBodyFloatData_m_clusters_set(swigCPtr, this, SoftBodyClusterData.getCPtr(value), value);
  }

  public SoftBodyClusterData getM_clusters() {
    long cPtr = gdxBulletJNI.btSoftBodyFloatData_m_clusters_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SoftBodyClusterData(cPtr, false);
  }

  public void setM_joints(btSoftBodyJointData value) {
    gdxBulletJNI.btSoftBodyFloatData_m_joints_set(swigCPtr, this, btSoftBodyJointData.getCPtr(value), value);
  }

  public btSoftBodyJointData getM_joints() {
    long cPtr = gdxBulletJNI.btSoftBodyFloatData_m_joints_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btSoftBodyJointData(cPtr, false);
  }

  public void setM_numMaterials(int value) {
    gdxBulletJNI.btSoftBodyFloatData_m_numMaterials_set(swigCPtr, this, value);
  }

  public int getM_numMaterials() {
    return gdxBulletJNI.btSoftBodyFloatData_m_numMaterials_get(swigCPtr, this);
  }

  public void setM_numNodes(int value) {
    gdxBulletJNI.btSoftBodyFloatData_m_numNodes_set(swigCPtr, this, value);
  }

  public int getM_numNodes() {
    return gdxBulletJNI.btSoftBodyFloatData_m_numNodes_get(swigCPtr, this);
  }

  public void setM_numLinks(int value) {
    gdxBulletJNI.btSoftBodyFloatData_m_numLinks_set(swigCPtr, this, value);
  }

  public int getM_numLinks() {
    return gdxBulletJNI.btSoftBodyFloatData_m_numLinks_get(swigCPtr, this);
  }

  public void setM_numFaces(int value) {
    gdxBulletJNI.btSoftBodyFloatData_m_numFaces_set(swigCPtr, this, value);
  }

  public int getM_numFaces() {
    return gdxBulletJNI.btSoftBodyFloatData_m_numFaces_get(swigCPtr, this);
  }

  public void setM_numTetrahedra(int value) {
    gdxBulletJNI.btSoftBodyFloatData_m_numTetrahedra_set(swigCPtr, this, value);
  }

  public int getM_numTetrahedra() {
    return gdxBulletJNI.btSoftBodyFloatData_m_numTetrahedra_get(swigCPtr, this);
  }

  public void setM_numAnchors(int value) {
    gdxBulletJNI.btSoftBodyFloatData_m_numAnchors_set(swigCPtr, this, value);
  }

  public int getM_numAnchors() {
    return gdxBulletJNI.btSoftBodyFloatData_m_numAnchors_get(swigCPtr, this);
  }

  public void setM_numClusters(int value) {
    gdxBulletJNI.btSoftBodyFloatData_m_numClusters_set(swigCPtr, this, value);
  }

  public int getM_numClusters() {
    return gdxBulletJNI.btSoftBodyFloatData_m_numClusters_get(swigCPtr, this);
  }

  public void setM_numJoints(int value) {
    gdxBulletJNI.btSoftBodyFloatData_m_numJoints_set(swigCPtr, this, value);
  }

  public int getM_numJoints() {
    return gdxBulletJNI.btSoftBodyFloatData_m_numJoints_get(swigCPtr, this);
  }

  public void setM_config(SoftBodyConfigData value) {
    gdxBulletJNI.btSoftBodyFloatData_m_config_set(swigCPtr, this, SoftBodyConfigData.getCPtr(value), value);
  }

  public SoftBodyConfigData getM_config() {
    long cPtr = gdxBulletJNI.btSoftBodyFloatData_m_config_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SoftBodyConfigData(cPtr, false);
  }

  public btSoftBodyFloatData() {
    this(gdxBulletJNI.new_btSoftBodyFloatData(), true);
  }

}
